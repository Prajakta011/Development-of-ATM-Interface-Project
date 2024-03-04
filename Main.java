package com.Task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        User user1 = new User("Prajakta@123","2111",1000.0);
        ATM atm = new ATM(user1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM. Please enter your user ID");
        String userID = scanner.nextLine();
        System.out.println("PLease enter your PIN :");
        String userPIN = scanner.nextLine();

        if(userID.equals(user1.getUserID()) && userPIN.equals(user1.getUserPIN())) {
            System.out.println("Authentication Successful.");

            int choice;
            do{
                System.out.println("ATM menu");
                System.out.println("1.Check Balance");
                System.out.println("2.Withdraw Money");
                System.out.println("3.Deposit Money");
                System.out.println("4.Exit");
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1 :
                        System.out.println("Your account balance is:" + atm.checkBalance());
                        break;
                    case 2 :
                        System.out.println("Enter the amount to withdraw:");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 3 :
                        System.out.println("Enter the amount to deposit:");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 4 :
                        System.out.println("Thank you for visiting the ATM.Goodbye!");
                        break;
                    default :
                        System.out.println("Invalid choice.Please try again.");

                }
            } while(choice!=4);
        } else {
            System.out.println("Invalid userID or PIN. Authentication failed.");
        }
        scanner.close();
    }
}
