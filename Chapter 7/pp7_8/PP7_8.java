package pp7_8;

import java.util.Scanner;

public class PP7_8 
{	
	
	  public static void main (String[] args)
	  {
		  Scanner scan = new Scanner(System.in);
		  String[] first = new String[24];
		  String[] last = new String[24];
		  int[] zip = new int[24];
		  
		  System.out.println("Enter first name");
		  first[0] = scan.nextLine();
		  
		  System.out.println("Enter last name");
		  last[0] = scan.nextLine();
		  
		  System.out.println("Enter zip code");
		  zip[0] = scan.nextInt();
		  
		  System.out.println(first[0]);
		  System.out.println(last[0]);
		  System.out.println(zip[0]);
		  
		  
	   
	  }
}
