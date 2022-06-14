/*
Email Application

Scenario: You are an IT support Administrator Specialist and we are charged with the task
of creating email accounts for new hires.

Your application should do the following:
- generate an email with the following syntax:firstname.lastname@department.company.com
- determine the department(sales, development, accounting), if none leave blank
- generate a random string for a password
- have set methods to change the password, set the mailbox capacity and define an alternate
email address
- Have get methods to display the name, email amd mailbox capacity.
 */
package Project1.EmailApplication;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Creating a new employee(i.e an object of the Email class).
        Email em1 = new Email();


        int choice;
        do {
            System.out.println("Enter your choice : ");
            System.out.println(" 1 Show info \n 2 Change Password \n 3 Change mailbox capacity \n 4 set alternate Email \n 5 Get your email address \n 6 Get your password \n 7 Get your mailbox capacity \n 8 Get your alternate email");
            System.out.println("Enter 9 to Exit");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    em1.showInfo();
                    break;
                case 2:
                    em1.changePassword();
                    break;
                case 3:
                    em1.setMailboxCapacity();
                    break;
                case 4:
                    em1.setAlternateEmail();
                    break;
                case 5:
                    em1.getEmail();
                    break;
                case 6:
                    em1.getPassword();
                    break;
                case 7:
                    em1.getMailboxCapacity();
                case 8:
                    em1.getAlternateEmail();
                case 9:
                    System.out.println("Thanks for using this services");
                    break;
                default:
                    System.out.println("Invalid choice! Enter again");
            }

        } while (choice != 9);

    }
}

