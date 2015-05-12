package pp7_6;

import java.util.Scanner;

public class PP7_6 
{

	private String accountNumber;
	private String accountName;
	private double balance;

	// the methods

	// the constructor
	public PP7_6(String numberIn, String nameIn)
	{
	accountNumber = numberIn;
	accountName = nameIn;
	balance = 0;
	}

	// methods to read the attributes
	public String getAccountName()
	{
	return accountName;
	}

	public String getAccountNumber()
	{
	return accountNumber;
	}

	public double getBalance()
	{
	return balance;
	}

	// methods to deposit and withdraw money
	public void deposit(double amountIn)
	{
	balance = balance + amountIn;
	}
	public boolean withdraw(double amountIn)
	{
	if(amountIn > balance)
	{
	return false;
	}
	else
	{
	balance = balance - amountIn;
	return true;
	}
	}
	public static void main(String[] args)
	{
	PP7_6[] accountList = new PP7_6[30];
	accountList[0] = new PP7_6 ("1", "John Bishop");
	accountList[1] = new PP7_6 ("2", "John Bishop");
	accountList[2] = new PP7_6 ("3", "John Bishop");
	accountList[3] = new PP7_6 ("4", "John Bishop");
	accountList[4] = new PP7_6 ("5", "John Bishop");
	accountList[5] = new PP7_6 ("6", "John Bishop");
	accountList[6] = new PP7_6 ("7", "John Bishop");
	accountList[7] = new PP7_6 ("8", "John Bishop");
	accountList[8] = new PP7_6 ("9", "John Bishop");
	accountList[9] = new PP7_6 ("10", "John Bishop");
	accountList[10] = new PP7_6 ("11", "John Bishop");
	accountList[11] = new PP7_6 ("12", "John Bishop");
	accountList[12] = new PP7_6 ("13", "John Bishop");
	accountList[13] = new PP7_6 ("14", "John Bishop");
	accountList[14] = new PP7_6 ("15", "John Bishop");
	accountList[15] = new PP7_6 ("16", "John Bishop");
	accountList[16] = new PP7_6 ("17", "John Bishop");
	accountList[17] = new PP7_6 ("18", "John Bishop");
	accountList[18] = new PP7_6 ("19", "John Bishop");
	accountList[19] = new PP7_6 ("20", "John Bishop");
	accountList[20] = new PP7_6 ("21", "John Bishop");
	accountList[21] = new PP7_6 ("22", "John Bishop");
	accountList[22] = new PP7_6 ("23", "John Bishop");
	accountList[23] = new PP7_6 ("24", "John Bishop");
	accountList[24] = new PP7_6 ("25", "John Bishop");
	accountList[25] = new PP7_6 ("26", "John Bishop");
	accountList[26] = new PP7_6 ("27", "John Bishop");
	accountList[27] = new PP7_6 ("28", "John Bishop");
	accountList[28] = new PP7_6 ("29", "John Bishop");
	accountList[29] = new PP7_6 ("30", "John Bishop");

	

	System.out.println("Please Enter the account number that you wish to deposite money: ");
	Scanner sc = new Scanner(System.in);
	String accountNum = sc.next();
	boolean IsAccount = false;

	for (int i = 0; i <= 29; i++) {
	if(accountNum.equals(accountList[i].getAccountNumber())) {
	double amount;
	do {
	System.out.println("Please Enter the amount that you want to deposit or Type '0' to quit: ");
	amount = sc.nextDouble();
	accountList[i].deposit(amount);
	System.out.println("Please Enter the amount that you want to withdraw or Type '0' to quit: ");
	amount = sc.nextDouble();
	accountList[i].withdraw(amount);
	}
	while (amount != 0);
	System.out.println(accountList[i].getAccountNumber());
	System.out.println(accountList[i].getAccountName());
	System.out.println(accountList[i].getBalance());
	IsAccount = true;
	}
	}
	if (!IsAccount) {
	System.out.println("There is no such an account!");
	}
	}
	}



	
