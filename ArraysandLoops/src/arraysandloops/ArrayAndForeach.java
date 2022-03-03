package arraysandloops;

import java.util.Scanner;

public class ArrayAndForeach {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] values = new int[5];
		System.out.println("enter values in arrays");
		for(int i=0;i<values.length;i++)
		{
			values[i] = scan.nextInt();
		}
		
		for(int i:values)
		{
			System.out.println(i);
		}

	}

}
