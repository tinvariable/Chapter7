package pp7_1;
import java.util.Scanner;


public class PP7_1 
{

	public static void main(String[] args) 
	{
		
		int[] numbers = new int[51];
		  inputArray(numbers);

		  }

		  public static void inputArray(int[] myList)
		  {
		    Scanner input = new Scanner(System.in);
		      System.out.print("Enter integers from 1-50 (input 0 value to end inputs): ");
		      int index = 0;
		      for(int i = 1; i < myList.length - 1; i++)
		      {
		        if(i > 0)
		        {
		          index = input.nextInt();  
		          if (index > 0 && index < myList.length)
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
