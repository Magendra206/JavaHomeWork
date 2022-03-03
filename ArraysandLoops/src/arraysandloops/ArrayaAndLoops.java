package arraysandloops;

import java.util.Scanner;

public class ArrayaAndLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float[] marks = new float[5];
		
		System.out.println("Enter the values in array");
		for(int i=0;i<marks.length;i++)
		{
			marks[i] = scan.nextFloat();
		}
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		

	}

}
