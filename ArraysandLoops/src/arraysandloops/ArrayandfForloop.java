package arraysandloops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayandfForloop {

	public static void main(String[] args) {
			
		    Scanner sc = new Scanner(System.in);
			float[] marks = new float[5];
			
			System.out.println("Enter the values of Array");
			for(int i=0;i<marks.length;i++) {
				marks[i] = sc.nextFloat();
			}
			
			System.out.println("values of Array.......");
			for(int i=0;i<marks.length;i++) {
				System.out.println(marks[i]);
			}
			
			Arrays.sort(marks);
			System.out.println("values of Array.......");
			for(int i=0;i<marks.length;i++) {
				System.out.println(marks[i]);
			}
			
			System.out.println("Maximum in array = ");
			System.out.println(marks[marks.length-1]);
			System.out.println("Minimum in array = ");
			System.out.println(marks[0]);
			sc.close();

	}

}
