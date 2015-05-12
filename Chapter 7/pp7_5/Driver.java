package pp7_5;

public class Driver 
{
	public static double mean(int[] numbers, int count)
	{
		double sum = 0.0;
		for(int i = 0; i < count; i++)
		{
			sum += numbers[i];
		}
		return sum/count;
		
		
	}
	public static double standardDeviation(int[] numbers, int count)
	{
		double result = 0.0;
		double mean = mean(numbers, count);
		for(int i = 0; i < count; i++)
		{
			result += Math.pow(numbers[i] - mean, 2);
		}
		return Math.sqrt(result/count-1);
	}

}
