package pp7_9;

import java.util.Scanner;

public class PP7_9 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		  String[] first = new String[24]; //first name, street address, state
		  String[] last = new String[24]; //last name and city
		  int[] zip = new int[24]; //zip and phone
		  
		  System.out.println("Enter first name");
		  first[0] = scan.nextLine();
		  
		  System.out.println("Enter last name");
		  last[0] = scan.nextLine();
		  
		  System.out.println("Enter zip code");
		  zip[0] = scan.nextInt();
		  
		  System.out.println("Enter Street Address");
		  first[1] = scan.nextLine();
		  
		  System.out.println("Enter city");
		  last[1] = scan.nextLine();
		  
		  System.out.println("Enter State");
		  first[2] = scan.nextLine();
		  
		  System.out.println("Enter Phone Number");
		  zip[1] = scan.nextInt();
		  
		  
		  System.out.println(first[0]);
		  System.out.println(first[1]);
		  System.out.println(first[2]);
		  System.out.println(last[0]);
		  System.out.println(last[1]);
		  System.out.println(zip[0]);
		  System.out.println(zip[1]);
		  

	}

}
