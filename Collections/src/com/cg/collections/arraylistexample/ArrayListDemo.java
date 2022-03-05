package com.cg.collections.arraylistexample;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(true);
		a.add(3.14f);
		a.add("hello");
		System.out.println(a);
		
		for(Object i :a) {
			System.out.println(i);
		}
		
		System.out.println();

	}

}
