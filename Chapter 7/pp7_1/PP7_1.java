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
	      String line = scan.nextLine();

	      
	      for (int index = 0; index < array.length; index++)
	      {
	         
	         if (index >= 0 && index <= 50)
	            array[index-0]++;
	      }
	      for (int current=0; current < array.length; current++)
	      {
	         System.out.print((current + 0));
	         System.out.print(": " + array[current]);
	      }
	      
	      
	      System.out.println ();
	      
	      System.out.println();
	      //System.out.println("Numbers: " + other);
		
		

	}

}
