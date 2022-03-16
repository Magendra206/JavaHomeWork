package com.cg.mcqspractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArList {
	static String m(float i) {
		return "float";
	}
	static String m(double i)
	{
		return "double";
	}

	public static void main(String[] args) {
		int a1 = 1;
		long b1 = 2;
		System.out.println(m(a1) + " "+m(b1));
//		List<String> trainers = new ArrayList<String>();
//		  trainers.add("Soham");
//		  trainers.add("Tina");
//		  trainers.add("Anju");
//		  trainers.add("Kavya");
//		  trainers.add("");
//		  trainers.add("null");
//		  trainers.add("Soham");
//		  trainers.add("Tina");
//
//		  Set<String> list = trainers.stream().filter(s -> s.startsWith("S")).collect(Collectors.toSet());
//		  System.out.println(list);
		
		  

	}

}
