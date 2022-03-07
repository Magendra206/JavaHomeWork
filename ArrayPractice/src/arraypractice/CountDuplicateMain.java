package arraypractice;

import java.util.Scanner;

public class CountDuplicateMain {

	public static void main(String[] args) {
		CountDuplicateInArray cda = new CountDuplicateInArray();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements into array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scan.nextInt();
		}
		System.out.println("no of duplicates in array "+cda.CountDuplicate(arr));

	}

}
