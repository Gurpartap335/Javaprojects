package Project1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("IRON MAN","2343");
        obj1.showMenu();
    }
}

class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    void deposit(int amount){
        if (amount > 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if(amount < balance ) {
            balance -= amount;
            previousTransaction = -amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
        else {
            System.out.println("Your balance is less than " + amount + "\tTransaction failed...");
        }
    }

    void getPreviousTraction(){
        if(previousTransaction > 0){
            System.out.println("Deposited: " + previousTransaction);
        }

        else if(previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }

        else {
            System.out.println("No transaction occur");
        }
    }

    void showMenu() {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);

        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");
        char option;
        do {
            System.out.println("================================================");
            System.out.println("Enter an option");
            System.out.println("================================================");
            option = s.next().charAt(0);

            switch (option) {
                case 'A':
                    System.out.println("------------------------------------------");
                    System.out.println("Balance = "+balance);
                    System.out.println("------------------------------------------");
                    break;
                case 'B':
                    System.out.println("------------------------------------------");
                    System.out.println("Enter an amount to deposit : ");
                    System.out.println("------------------------------------------");
                    int amount  = s.nextInt();
                    deposit(amount);
                    break;
                case 'C':
                    System.out.println("------------------------------------------");
                    System.out.println("Enter an amount to withdraw money");
                    System.out.println("------------------------------------------");
                    int wamount = s.nextInt();
                    withdraw(wamount);
                    break;
                case 'D':
                    System.out.println("------------------------------------------");
                    getPreviousTraction();
                    System.out.println("------------------------------------------");
                    break;
                case 'E':
                    System.out.println("************************************************");
                    break;
                default:
                    System.out.println("Invalid option Please enter again");
                    break;

            }

        } while (option != 'E');
        System.out.println("Thankyou for using services");
    }


}
