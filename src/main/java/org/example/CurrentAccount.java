package org.example;

public class CurrentAccount extends WithdrawableBankAccount {
    @Override
    public boolean withdraw() {
        System.out.println("withdraw from current account");
        return true;
    }
}
