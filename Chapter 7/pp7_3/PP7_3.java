package pp7_3;

import java.util.Scanner;

public class PP7_3 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		 
        int n, nextt, ix;
 
       
 
        do 
        {
            System.out.print("Please type the number of numbers:");
            n = scan.nextInt();
        } 
        while (n < 0);
        
        int[] numbers = new int[n];
        
        for (ix = 0; ix < n; ix++) 
        {
            
            do 
            {
                System.out.println((ix + 1) + ") Type a new number in the range 1 and 100:");
                nextt = scan.nextInt();
            } 
            while (nextt < 1 || nextt > 100);
            
            numbers[ix] = nextt;
        }
        
        String[] stars = {" 1-10 |", "11- 20 | ", "21- 30 | ", "31- 40 | ", "41- 50 | ",
            "51- 60 | ", "61- 70 | ", "71- 80 | ", "81- 90 | ", "91-100 | "};
        
        for (ix = 0; ix < n; ix++) 
        {
            nextt = numbers[ix];
            if (nextt < 11) 
            {
                stars[0] += "*";
                
            } 
            else if (nextt < 21) 
            {
                stars[1] += "*";
            } 
            else if (nextt < 31) 
            {
                stars[2] += "*";
            }
            else if (nextt < 41) 
            {
                stars[3] += "*";
            }
            else if (nextt < 51) 
            {
                stars[4] += "*";
            }
            else if (nextt < 61) 
            {
                stars[5] += "*";
            }
            else if (nextt < 71) 
            {
                stars[6] += "*";
            }
            else if (nextt < 81) 
            {
                stars[7] += "*";
            }
            else if (nextt < 91) 
            {
                stars[8] += "*";
            }
            else 
            {
                stars[9] += "*";
            }
        }
        for (ix = 0; ix < 10; ix++) 
        {
            System.out.println(stars[ix]);
        }

	}

}
