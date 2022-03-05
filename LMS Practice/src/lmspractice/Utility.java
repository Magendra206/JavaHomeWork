package lmspractice;

public class Utility {
	public static int fahrenheitToCelcius(double fahrenheit)
	{
		double celcius;
		celcius = (fahrenheit-32)*5/9;
		int c = (int) Math.round(celcius);
		return c;
	}
	public static String getLevel(int[] array)
	{
		int sum = 0;
		for(int i=0;i<=array.length-1;i++)
		{
			sum = sum + array[i];
		}
		if(sum>=100)
		{
			return "HIGH";
		}
		else if(sum>=70 && sum<100)
		{
			return "MEDIUM";
		}
		else if(sum<70)
		{
			return "LOW";
		}
		else
		{
			return "INVALID SUM";
		}
	}

}
