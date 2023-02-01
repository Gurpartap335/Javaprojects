package Car;

import java.util.Scanner;

public class Car {
    Scanner s = new Scanner(System.in);
    private String name;
    private String type;
    private String model;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {
        System.out.println("Enter car name : ");
        name = s.nextLine();
        System.out.println("Enter car model : ");
        model = s.nextLine();
        System.out.println("Enter car type: ");
        type = s.nextLine();
    }

    public Car(String name, String type, String model) {
        this.name = name;
        this.type = type;
        this.model = model;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
    }
}
