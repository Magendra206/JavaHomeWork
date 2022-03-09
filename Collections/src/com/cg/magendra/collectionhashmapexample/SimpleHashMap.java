package com.cg.magendra.collectionhashmapexample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SimpleHashMap {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 10);
		hm.put(2, 70);
		hm.put(3, 30);
		hm.put(4, 40);
		System.out.println(hm);
		
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = hm.values();
		System.out.println(values);
		
		Collection<Entry<Integer,Integer>> key_value = hm.entrySet();
		System.out.println(key_value);

	}

}
