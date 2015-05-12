package pp7_5;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class PP7_5 
{

	public static void main(String[] args) 
	{
		DecimalFormat fmt = new DecimalFormat("#0.000");
	    Random rand = new Random();
		final int MAX_COUNT = 50;
		final int MAX = 100;
		int count = rand.nextInt(MAX_COUNT) +1;
        Scanner scan = new Scanner(System.in);
        
        int[] numbers = new int[MAX_COUNT];
        
               
        for(int i = 0; i < count; i++)
        {
        	numbers[i] = rand.nextInt(MAX) +1;
        }
        System.out.println("Count: " +count);
        System.out.println("Mean: " + fmt.format(Driver.mean(numbers, count)));
        System.out.println("Standard Deviation: " + fmt.format(Driver.standardDeviation(numbers, count)));
   }

}