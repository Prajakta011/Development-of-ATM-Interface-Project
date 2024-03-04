package com.Task_2;

public class User {
    private String userID;
    private String userPIN;
    private double accountBalance;
    public User(String userID , String userPIN , double accountBalance){
        this.userID = userID;
        this.userPIN = userPIN;
        this.accountBalance = accountBalance;
    }
    public String getUserID(){
        return userID;
    }
    public String getUserPIN(){
        return userPIN;
    }
    public double getAccountBalance(){
        return accountBalance;
    }

    public void updateBalance(double amount){
        accountBalance = accountBalance + amount;
    }
}
