package com.cg.mcqspractice;

import java.util.Scanner;

public class ClssMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		Punctutation p = new Punctutation();
		int res = p.countPunctuation(str);
		System.out.println(res);

	}

}
