package com.cg.functionalintefaceexamples;

import com.cg.functinalinterface.Add;
import com.cg.functinalinterface.Div;
import com.cg.functinalinterface.Sub;

public class FunMain {

	public static void main(String[] args) {
		Add ad = ()->System.out.println("addition is happened");
		ad.add();
		
		Sub sb = (x,y) -> System.out.println("Substraction = " + (x -y));
		sb.substraction(15, 10);
		
		Sub sb1 = (x,y) -> {
			if(x > y) {
			System.out.println("Substraction = " + (x -y));
			}else {
				System.out.println("else block Substraction = " + (y - x));
			}
		};
		
		sb1.substraction(5, 10);
		
		Div div1 = (x,y) -> {
			if(x > y) {
			return x/y;
			}else {
				return y/x;
			}
			
		};
		
		int result = div1.div(10, 5);
		System.out.println("Result = " + result);
		
		

	}

}
