package Project1.EmailApplication;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("New worker : " + this.firstName + " " + this.lastName);

        // call a method asking for the department + return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);

        // call a method that returns a random password.
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is:" + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//        System.out.println("Your email is: " + email);

    }

    // ask for the department
    private String setDepartment() {
        System.out.println("Department Codes : \n1 for Sales\n2 for Development\n3 for Account\n0 for none");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter code here : ");
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Account";
        } else {
            return "";
        }
    }

    // generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRS123456789!@#$%^";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }

    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // set the alternative email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // change password
    public void changePassword(String password) {
        this.password = password;
    }


    public int getMailboxCapacity() {return  mailboxCapacity;}

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }


    public void showInfo() {
        System.out.println("Display Name : " + firstName + " " + lastName);
        System.out.println("Company Email : " + email);
        System.out.println("Mail Box capacity : " + mailboxCapacity);
    }
}
