package com.Task_2;

public class ATM {
    private User currentUser;

    public ATM(User user){
        currentUser = user;
    }

    public double checkBalance(){
        return currentUser.getAccountBalance();
    }

    public void withdraw(double amount){
        if(amount > currentUser.getAccountBalance()){
            System.out.println("Insufficient Balance");
        }
        else {
            currentUser.updateBalance(-amount);
            System.out.println("Amount withdrawn :"+ amount);
        }
    }

    public void deposit(double amount){
        currentUser.updateBalance(amount);
        System.out.println("Amount Deposited :"+ amount);
    }
}
