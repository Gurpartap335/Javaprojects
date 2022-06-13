package Project1.EmailApplication;

import java.util.Scanner;

public class Email {
    Scanner s = new Scanner(System.in);
    private final String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first name and last name
    Email(){
        System.out.println("Enter your first name : ");
        firstName = s.nextLine();

        System.out.println("Enter your last name : ");
        lastName = s.nextLine();

        this.department = setDepartment();
        System.out.println("Your department is : " + this.department);

        // random password we generate
        System.out.println("This application generate a random password for every employee");
        this.password = randomPassword(10);

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
        String passwordSet = "ABCDEFGHIJKLMNOPQRS123456789!@#$%^" + "abcdefghjklmnopqrstuvwxyz";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }

        return new String(password);
    }


    // set the mailbox capacity
    public void setMailboxCapacity() {
        System.out.println("Current capacity = " + this.mailboxCapacity + "mb");
        System.out.println("Enter new capacity : ");
        int n  = s.nextInt();
        if (n < 0) {
            System.out.println("Mail box capacity cannot be less than 0");
        }
        System.out.println("Mailbox capacity changed successfully");
    }


    // set the alternative email
    public void setAlternateEmail() {
        System.out.println("Enter new alternate email : ");
        String altEmail = s.nextLine();
        this.alternateEmail = altEmail;
    }

    // change password
    public void changePassword() {
        System.out.println("Enter new password : ");
        String pass = s.nextLine();
        while (true) {
            if (pass.length() >= 8) {
                this.password = pass;
                break;
            }
        }
    }


    public void getMailboxCapacity() {
        System.out.println(mailboxCapacity);
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void getPassword() {
        System.out.println(this.password);
    }

    void getEmail() {
        System.out.println(email);
    }


    public void showInfo() {
        System.out.println("Display Name : " + firstName + " " + lastName);
        System.out.println("Company Email : " + email);
        System.out.println("Mail Box capacity : " + mailboxCapacity);
        System.out.println("Password: " + this.password);
        System.out.println("MailBox capacity : " + this.mailboxCapacity + "mb");
        System.out.println("Alter email: " + this.alternateEmail);
    }
}

//    public Email(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        System.out.println("New Employee : " + this.firstName + " " + this.lastName);
//
//        // call a method asking for the department + return the department
//        this.department = setDepartment();
//
//        // call a method that returns a random password.
//        this.password = randomPassword(defaultPasswordLength);
////        System.out.println("Your password is:" + this.password);
//
//        // combine elements to generate email
//        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
////        System.out.println("Your email is: " + email);
//    }
