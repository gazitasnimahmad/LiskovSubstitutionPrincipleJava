package org.example;

public class SavingsAccount extends WithdrawableBankAccount{
    @Override
    public boolean withdraw() {
        System.out.println("withdraw from savings account");
        return true;
    }
}
