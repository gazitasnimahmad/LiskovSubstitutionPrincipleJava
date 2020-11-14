package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WithdrawableBankAccount savingsBankAccount = new SavingsAccount();
        savingsBankAccount.openAccount("savings ");
        savingsBankAccount.withdraw();

        WithdrawableBankAccount currentBankAccount = new CurrentAccount();
        currentBankAccount.openAccount("current ");
        currentBankAccount.withdraw();

        BankAccount ppfBankAccount = new PpfAccount();
        ppfBankAccount.openAccount("PPf");
    }
}
