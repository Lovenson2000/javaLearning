package oop;

public class Mobile {

    static String brand = "Samsung";
    int price;
    String name = "Samsung";

    public static void showMobileData(Mobile mobile) {
        System.out.println(mobile.name + " is made by " + brand + " and costs $" + mobile.price);
    }

    public static void main(String[] args) {

        Mobile mob = new Mobile();
        Mobile mob2 = new Mobile();

        brand = "Apple";
        mob.name = "Iphone 15";
        mob.price = 24500;
        showMobileData(mob);

        brand = "Samsung";
        mob.name = "Galaxy S25";
        mob2.price = 34322;
        showMobileData(mob2);
    }
}
