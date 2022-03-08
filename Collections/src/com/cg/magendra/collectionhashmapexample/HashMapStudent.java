package com.cg.magendra.collectionhashmapexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class HashMapStudent {

	public static void main(String[] args) {
		HashMap<String, Float> stuData = new HashMap<String, Float>();
		
		stuData.put("Magendra",90.0f);
		stuData.put("azhar", 91.0f);
		stuData.put("vineeth", 80.0f);
		stuData.put("madhu", 98.0f);
		//retrieving keys
		Set<String> stu_keys = stuData.keySet();
		System.out.println(stu_keys);
		for(String s:stu_keys)
		{
			System.out.println(s);
		}
		
		
		// calculating average marks of the students
		Collection<Float> stu_value = stuData.values();
		System.out.println(stu_value);
		float res = 0;
		for(Float f:stu_value)
		{
			res = res + f;
			//System.out.println(res/4);
		}
		System.out.println(res/4);
		
		//retrieving entryset
		Collection<Entry<String,Float>> stu_details = stuData.entrySet();
		System.out.println(stu_details);
		for(Entry<String,Float> e:stu_details)
		{
			System.out.println(e);
		}
		
		
		
		//highest marks scored by the student
		TreeSet<Float> t = new TreeSet<Float>(stuData.values());
		System.out.println(t);
		System.out.println(t.last());
		
		//sorting the studetname
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(stu_keys);
		for(String s:ts) {
			System.out.println(s);
		}
		
		
		/*ArrayList<String> a = new ArrayList<String>();
		a.addAll(stu_keys);
		System.out.println(a);*/
		
		
		
		
		

	}

}
