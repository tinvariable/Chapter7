package test;

import java.util.Scanner;

public class Testrun 
{
	public static void main(String[] args)
	{
	Test[] accountList = new Test[30];
	accountList[0] = new Test ("1", "John Bishop");
	accountList[1] = new Test ("2", "John Bishop");
	accountList[2] = new Test ("3", "John Bishop");
	accountList[3] = new Test ("4", "John Bishop");
	accountList[4] = new Test ("5", "John Bishop");
	accountList[5] = new Test ("6", "John Bishop");
	accountList[6] = new Test ("7", "John Bishop");
	accountList[7] = new Test ("8", "John Bishop");
	accountList[8] = new Test ("9", "John Bishop");
	accountList[9] = new Test ("10", "John Bishop");
	accountList[10] = new Test ("11", "John Bishop");
	accountList[11] = new Test ("12", "John Bishop");
	accountList[12] = new Test ("13", "John Bishop");
	accountList[13] = new Test ("14", "John Bishop");
	accountList[14] = new Test ("15", "John Bishop");
	accountList[15] = new Test ("16", "John Bishop");
	accountList[16] = new Test ("17", "John Bishop");
	accountList[17] = new Test ("18", "John Bishop");
	accountList[18] = new Test ("19", "John Bishop");
	accountList[19] = new Test ("20", "John Bishop");
	accountList[20] = new Test ("21", "John Bishop");
	accountList[21] = new Test ("22", "John Bishop");
	accountList[22] = new Test ("23", "John Bishop");
	accountList[23] = new Test ("24", "John Bishop");
	accountList[24] = new Test ("25", "John Bishop");
	accountList[25] = new Test ("26", "John Bishop");
	accountList[26] = new Test ("27", "John Bishop");
	accountList[27] = new Test ("28", "John Bishop");
	accountList[28] = new Test ("29", "John Bishop");
	accountList[29] = new Test ("30", "John Bishop");

	

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


