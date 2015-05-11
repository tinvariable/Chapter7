package pp7_5;

import java.text.DecimalFormat;
import java.util.Scanner;


public class PP7_5 
{

	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        
        int[] input = new int[51];
        double mean = 0;
        int numbers;
        int i = 0;
        
        System.out.println("Enter up to 50 integers enter a number out of bounds to stop: ");
 
        for(int index = 0; index <= 1; index++)
        {
        	if(scan.nextInt() >= 0)
        	{
        	i = scan.nextInt();
        	}
        	else
        		break;
        }
      
        System.out.println(input[i]);
   }

}