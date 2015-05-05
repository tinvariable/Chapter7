package pp7_4;

import java.util.Scanner;

public class PP7_4 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		 
        int n, nextt, ix;
        int num = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0, num7 = 0, num8 = 0, num9 = 0, num10 = 0;
       
 
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
        
        String[] stars = {" 1-10 | ", "11- 20 | ", "21- 30 | ", "31- 40 | ", "41- 50 | ",
            "51- 60 | ", "61- 70 | ", "71- 80 | ", "81- 90 | ", "91-100 | "};
        
        for (ix = 0; ix < n; ix++) 
        {
            nextt = numbers[ix];
            if (nextt < 11) 
            {
            	num++;
            	if(num % 5 == 0)
            	stars[0] += "*";
                
            } 
            else if (nextt < 21) 
            {
            	num2++;
            	if(num2 % 5 == 0)
                stars[1] += "*";
            } 
            else if (nextt < 31) 
            {
            	num3++;
            	if(num3 % 5 == 0)
                stars[2] += "*";
            }
            else if (nextt < 41) 
            {
            	num4++;
            	if(num4 % 5 == 0)
                stars[3] += "*";
            }
            else if (nextt < 51) 
            {
            	num5++;
            	if(num5 % 5 == 0)
                stars[4] += "*";
            }
            else if (nextt < 61) 
            {
            	num6++;
            	if(num6 % 5 == 0)
                stars[5] += "*";
            }
            else if (nextt < 71) 
            {
            	num7++;
            	if(num7 % 5 == 0)
                stars[6] += "*";
            }
            else if (nextt < 81) 
            {
            	num8++;
            	if(num8 % 5 == 0)
                stars[7] += "*";
            }
            else if (nextt < 91) 
            {
            	num9++;
            	if(num9 % 5 == 0)
                stars[8] += "*";
            }
            else 
            {
            	num10++;
            	if(num10 % 5 == 0)
                stars[9] += "*";
            }
        }
        if(num / 5 == 0)
        {
        	stars[0] += "*";
        }
        for (ix = 0; ix < 10; ix++) 
        {
            System.out.println(stars[ix]);
        }


	}

}
