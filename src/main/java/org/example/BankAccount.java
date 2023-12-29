package org.example;

public class BankAccount {

    private double balance;
    private double minimumBalance;

    private boolean isActive = true;

    private String holderName;

    public BankAccount(double balance, double minimumBalance){
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance(){
        return balance;
    }

    public double getMinimumBalance(){
        return minimumBalance;
    }

    public void setIsActive(boolean status){
        this.isActive = status;
    }

    public boolean getIsActive(){
        return this.isActive;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName(){
        return holderName;
    }

    public double withdraw(double amount){
        if(balance - amount > minimumBalance){
            balance -= amount;
            return balance;
        }else{
            throw new RuntimeException();
        }
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

}
