package arraysandloops;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayandfForloop {

	public static void main(String[] args) {
			
			//create an array using following syntax
			float[] marks = new float[5];

			//store or read values in to array from keyborad
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the values of Array");
			for(int i=0;i<marks.length;i++) {
				marks[i] = sc.nextFloat();
			}
			
			//reading the array values from array to display in console
			System.out.println("values of Array.......");
			for(int i=0;i<marks.length;i++) {
				System.out.println(marks[i]);
			}
			
			Arrays.sort(marks);
			//reading the array values from array after sort to display in console
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
