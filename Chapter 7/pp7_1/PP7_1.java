package pp7_1;
import java.util.Random;
import java.util.Scanner;


public class PP7_1 
{

	public static void main(String[] args) 
	{
		
	      Scanner scan = new Scanner(System.in);
	      Random rand = new Random();

	      final int NUM = rand.nextInt(51);
	      int[] array = new int[NUM];
	     
  
	     // int other = 0; 
	      

	      System.out.println("Enter "+NUM+ " numbers: ");
	      int input = scan.nextInt();

	      
	      for (int index = 0; index < array.length; index++)
	      {
	         
	         if (index >= 0 && index <= 50)
	            array[index-0]++;
	      }
	      for (int current=0; current < array.length; current++)
	      {
	         System.out.println((current + 0));
	         System.out.println(": " + array[current]);
	      }
	      
	      
	      
		
		

	}

}
