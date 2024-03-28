package oop;

import java.util.Scanner;

public class User extends Person {

    private String email;
    private String country;

    public User() {
        super("", 0);
    }

    public void takeUserInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        super.setName(name);

        System.out.println("Enter age:");
        int age = scanner.nextInt();
        super.setAge(age);
        scanner.nextLine();

        System.out.println("Enter email:");
        String email = scanner.nextLine();
        setEmail(email);

        System.out.println("Enter country:");
        String country = scanner.nextLine();
        setCountry(country);

        scanner.close();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void displayAllInfo() {
        super.displayAllInfo();
        System.out.println("Email Address: " + email);
        System.out.println("Country: " + country);
    }
}
