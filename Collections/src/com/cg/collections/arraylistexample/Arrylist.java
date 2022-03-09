package com.cg.collections.arraylistexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Arrylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection c = new ArrayList<>();
		c.add(10);
		c.add("abc");
		
		Collection l = new HashSet();
		l.add(20);
		l.add("abc");
		l.add(30);
		c.addAll(l);
		c.removeAll(l);
		System.out.println(c);

	}

}
