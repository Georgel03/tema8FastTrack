package org.fasttrackit.tema8.Banking;

public class Main {

    public static void main(String[] args) {

        Bank firstAccount = new Bank("George", 40000, "ING");
        Bank secondAccount = new Bank ("Alexis", 5000, "BRD");
        Bank thirdAccount = new Bank ("Mircea", 35000, "BT");

        firstAccount.withdrawMoney(50000);
        firstAccount.depositMoney(20000);
        firstAccount.withdrawMoney(50000);
        firstAccount.printInfo();

        System.out.println("------------------------------");
        secondAccount.withdrawMoney(4999);
        secondAccount.printInfo();
    }
}
