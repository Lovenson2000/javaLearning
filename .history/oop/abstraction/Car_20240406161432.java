package abstraction;

public class Car extends Vehicle implements VehicleInterface {

    public Car(String type, String model, int year, int maximumSpeed) {
        super();
        this.type = "Car";
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    int getSpeed(int maximumSpeed) {
        return maximumSpeed;
    }

    @Override
    public void start() {
        System.out.println("Starting car");
        System.out.println("Voom Voom...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerating...");
    }

    @Override
    public void park() {
        System.out.println("'Parking Car...'");
    }

    @Override
    public void printVehicleInformation() {
        System.out.println("This is a " + type + " of model " + model + " and was made in " + year);
        System.out.println("Maximum speed is: " + maximumSpeed);
    }

    public static void main(String[] args) {
        Car car = new Car("Car", "Tesla XSP2", 2022, 78);
        car.printVehicleInformation();
    }
}
    