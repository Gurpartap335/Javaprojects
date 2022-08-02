package Car;

import java.util.Scanner;

public class Car {
    Scanner s = new Scanner(System.in);
    private String name;
    private String type;
    private String model;

    Car() {
        System.out.println("Enter car name : ");
        this.name = s.nextLine();
        System.out.println("Enter car model : ");
        this.model = model;
        this.model = s.nextLine();
        System.out.println("Enter car type: ");
        this.type = type;
        this.type = s.nextLine();
    }
}
