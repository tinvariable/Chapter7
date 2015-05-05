package pp7_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class PP7_2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<Integer>();
        int count = 0;



        while(true)
        {
            System.out.println("Please enter a number (enter a non-integer to end)");
            try{
                int x = input.nextInt();
                array.add(x);
                if (x>=0 && x<=50) {
                    count++;
                }
            }
            catch (InputMismatchException ex) {
                break;
            }
        }

        System.out.println();
        System.out.format("The numbers you entered were: %s\n", array);
        System.out.format("The count of in-range numbers was: %d\n", count);
		

	}

}
