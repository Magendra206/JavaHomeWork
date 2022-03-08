package lmspractice;

import java.util.Scanner;

public class RollnoValidate {

	public static void main(String[] args)   {
		Scanner scan = new Scanner(System.in);
		RollNoValidate1 rnv = new RollNoValidate1();
		System.out.println("Enter the string");
		String rollNumber = scan.next();
		long res;
		
			try {
				res = rnv.parseRollNumber(rollNumber);
				System.out.println(res);
			} catch (Exception message) {
				System.out.println(message.toString());
			}
		

	}

}
