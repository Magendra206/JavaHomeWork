package com.cg.streamapiexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListInt {

	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		ai.add(10);
		ai.add(20);
		ai.add(30);
		ai.add(40);
		ai.add(50);
		System.out.println(ai);
		
		System.out.println("doubling the values of arraylist");
		
		List<Integer> darray = ai.stream().map(i->i*2).collect(Collectors.toList());
		for(Integer i:darray)
		{
			System.out.println(i);
		}

	}

}
