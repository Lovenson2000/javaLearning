package oop;

import java.time.Year;

public class Car {

    public String brand;
    public int speed;
    public int yearOfProduction;
    public String madeInCountry;
    public double price;
    static int wheels = 4; // Shared accross all instances

    public Car(double price) {
        this.price = price;
    }

    public boolean isExpensive() {
        return price > 20000;
    }

    public boolean isOld() {
        return Year.now().getValue() - yearOfProduction <= 3;
    }

    public void printCarInformation() {
        System.out.println("This car has " + wheels + " and is a " + brand + ", made in " + yearOfProduction);
        System.out.println("It was made in " + madeInCountry + " and its maximum speed is: " + speed + "km/h");

        if (isExpensive()) {
            System.out.println("This car is considered to be expensive based on its " + price + "$ price");
        } else {
            System.out.println("This car is not very expensive based on its " + price + "$ price");
        }

        if (isOld()) {
            System.out.println("This car is considered to be brand new");
        } else {
            System.out.println("This car is getting old");
        }
    }

    public static void main(String[] args) {

        Car myCar = new Car(17532);
        myCar.brand = "Tesla";
        myCar.speed = 53;
        myCar.madeInCountry = "US";
        myCar.yearOfProduction = 2019;
        Car.wheels = 6;

        Car secondCar = new Car(24127);
        secondCar.brand = "Toyota";
        secondCar.speed = 45;
        secondCar.madeInCountry = "Japan";
        secondCar.yearOfProduction = 2013;

        myCar.printCarInformation();
        System.out.println();
        secondCar.printCarInformation();

    }
}