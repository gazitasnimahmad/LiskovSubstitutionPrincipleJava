package org.example;

public class PpfAccount extends BankAccount{
    @Override
   public boolean openAccount(String accountName) {
        System.out.println(accountName + "Account opened");
        return true;
    }
}
