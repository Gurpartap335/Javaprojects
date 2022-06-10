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
        Email em1 = new Email("John","Smith");

//        int choice;
//        do {
//            System.out.println("\n**************************\nENTER YOUR CHOICE\n1.Show Info\n2.Change Password"
//                    + "\n3.Change Mailbox Capacity\n4.Set Alternate Email\n5.Exit");
//            choice = s.nextInt();
//            switch (choice) {
//                case 1:
//                    em1.showInfo();
//                    break;
//                case 2:
//                    em1.changePassword();
//                    break;
//                case 3:
//                    em1.getPassword();
//                    break;
//                case 4:
//                    em1.setAlternateEmail();
//                    break;
//                case 5:
//                    em1.setAlternateEmail();
//                    break;
//                case 6:
//                    System.out.println("Thanks for using this services");
//                    break;
//                default:
//                    System.out.println("Invalid choice! Enter again");
//            }
//
//        }

    }
}

