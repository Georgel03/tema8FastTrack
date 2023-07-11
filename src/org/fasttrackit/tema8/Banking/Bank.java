package org.fasttrackit.tema8.Banking;

public class Bank {


    private String holderName;

    private double accountBalance;

    private String nameBank;

    public Bank(String holderName, double accountBalance, String nameBank) {
        this.nameBank = nameBank;
        this.holderName = holderName;
        this.accountBalance = accountBalance;
    }

    public void setNameBank(String name) {
        this.nameBank = name;
    }

    public String getNameBank() {
        return this.nameBank;
    }

    public void setHolderName(String name) {
        this.holderName = name;
    }

    public String getHolderName() {
        return this.holderName;
    }

    public void setAccountBalance(double amount) {
        this.accountBalance = amount ;
    }

    public double getAccountBalance() {
        return this.accountBalance;
    }

    public void depositMoney(double amount) {

        this.accountBalance += amount;
        System.out.println(String.format("The amount of %.2f lei has been deposited! You have %.2f right now", amount, this.accountBalance));
    }

    public void withdrawMoney(double amount) {

        if (amount > this.accountBalance) {
            System.out.println("Error! Insufficient funds!");
        }
        else {
            this.accountBalance -= amount;
            System.out.println("You have withdrew " + amount + " lei.");
            System.out.println("Right now you have " + this.accountBalance + " lei");
        }
    }

    public void printInfo() {
        System.out.println(String.format("Account holder %s at %s bank, has amount of money %.2f .", this.holderName, this.nameBank, this.accountBalance));
    }

}
