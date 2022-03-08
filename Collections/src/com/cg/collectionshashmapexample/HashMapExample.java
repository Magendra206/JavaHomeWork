package com.cg.collectionshashmapexample;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		
		hm.put(123, "hello");
		hm.put(124, "Magndra");
		hm.put(124, "Naik");
		System.out.println(hm);
		
		HashMap<Integer, Employee> empData = new HashMap<Integer, Employee>();
		Employee emp1 = new Employee(123, "Ram");
		Employee emp2 = new Employee(124, "maggi");
		empData.put(1,emp1);
		empData.put(2, emp2);
		System.out.println(empData);
		
		//retrieve the data from hashmap
		// keys retrieving
		Set<Integer> empData_keys = hm.keySet();
		System.out.println("empData Keys");
		for(Integer i:empData_keys)
		{
			System.out.println(i);
		}
		//retrieving values
		Collection<String> empdata_values = hm.values();
		System.out.println("employee values");
		for(String s:empdata_values)
		{
			System.out.println(s);
		}
		
		Collection<Entry<Integer, String>> emp_data = hm.entrySet();
		System.out.println("employee detais");
		for(Entry<Integer, String> i:emp_data)
		{
			System.out.println(i);
		}
		
	}

}
