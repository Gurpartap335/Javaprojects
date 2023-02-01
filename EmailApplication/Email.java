package EmailApplication;

import java.util.Scanner;

public class Email {
    Scanner s = new Scanner(System.in);
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
    Email(){
        System.out.println("Enter your first name : ");
        firstName = s.next();

        System.out.println("Enter your last name : ");
        lastName = s.next();

        this.department = setDepartment();
        System.out.println("Your department is : " + this.department);

        // random password we generate
        System.out.println("This application generate a random password for every employee");
        this.password = randomPassword(10);

        setEmail();
    }

    // ask for the department
    private String setDepartment() {

        System.out.println("""
                Department Code
                1 for sales
                2 for development
                3 account
                4 for none""");
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

    // setting email
    private void setEmail(){
        // combine elements to generate email
        email = firstName.toLowerCase().trim() + "." + lastName.toLowerCase().trim() + "@" + department + "." + companySuffix;
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
        while (true) {
            System.out.println("Enter new alternate email : ");
            this.alternateEmail = s.nextLine();
            if (alternateEmail.length() > 0) {
                System.out.println("You can need enter input");
                break;
            }
        }
    }

    // change password
    public void changePassword() {
        while (true) {
            System.out.println("Enter new password : ");
            String pass = s.next();
            if (pass.length() >= 8) {
                this.password = pass;
                break;
            }
        }
    }


    public void getMailboxCapacity() {
        System.out.println(mailboxCapacity);
    }

    public void getAlternateEmail() {
        System.out.println("Your alternate email is : " + alternateEmail);
    }

    public void getPassword() {
        System.out.println(password);
    }

    void getEmail() {
        System.out.println("Your email address : " + email);
    }

    void getDepartment() {
        System.out.println("Your Department : " + department);
    }

    public void showInfo() {
        System.out.println("Display Name : " + firstName + " " + lastName);
        System.out.println("Company Email : " + email);
        System.out.println("Department: " + department);
        System.out.println("Password: " + password);
        System.out.println("MailBox capacity : " + mailboxCapacity + "mb");
        System.out.println("Alter email: " + alternateEmail);
    }
}