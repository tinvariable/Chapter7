package test;

import java.util.Scanner;

public class Test 
{
	

	public static void main(String[] args) 
	{
		
		int[] numbers = new int[51];
		  inputArray(numbers);

		  }

		  public static void inputArray(int[] myList)
		  {
		    Scanner input = new Scanner(System.in);
		      System.out.print("Enter integers from -25 - 25 (input invalid integer to quit): ");
		      int index = 0;
		      index = input.nextInt();
		      
		      for(int i = 0; i < myList.length - 1; i++)
		      {
		        if(i >= 0 && i <= 50)
		        {
		          index = input.nextInt();  
		          if (index >= 0 && index <= myList.length)
		               myList[index-1]++;
		          else
		            break;  
		        }

		        if(myList[index-1] > 1)
		          System.out.println(index + " occurs " + myList[index-1] + " times ");
		        else
		          System.out.println(index + " occurs " + myList[index-1] + " time ");
		      } 
		  }

}
