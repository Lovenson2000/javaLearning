package abstraction;

public abstract class Vehicle {
    protected int maximumSpeed;
    protected String type;
    protected String model;
    protected int year;

    public abstract void printVehicleInformation();
}