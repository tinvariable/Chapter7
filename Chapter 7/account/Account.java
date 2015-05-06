package account;

import java.text.NumberFormat;

public class Account  
{
    private int accountNumber;
    private double balance;

    public Account(final Integer accountNumber, final Double initialBalance) 
    {
        this.accountNumber = accountNumber;
        balance = initialBalance;
    }

    public double deposit (double depositAmmount) 
    {
        balance += depositAmmount;
        return balance;
    }

    public double withdraw(double withdrawAmmount) 
    {
        balance -= withdrawAmmount;
        return balance;
    }

    public double getBalance() 
    {
        return balance;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }
  
}