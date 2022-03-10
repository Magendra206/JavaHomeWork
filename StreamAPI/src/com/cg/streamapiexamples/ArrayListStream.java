package com.cg.streamapiexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListStream {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("rama");
		al.add("raja");
		al.add("rani");
		al.add("magendra");
		al.add("ajay");
		al.add("siddi");
		
		for(String s:al)
		{
			System.out.println(s);
		}
		
		System.out.println("After sorting the elements with another---------- ");
		
		List<String> filteredNames = al.stream().filter(arr->arr.startsWith("r")).collect(Collectors.toList());
		for(String si:filteredNames)
		{
			System.out.println(si);
		}
		
		
		System.out.println("using sortd arraylist --------------");
		
		List<String> filteredName = al.stream().sorted().filter(arr->arr.startsWith("r")).collect(Collectors.toList());
		for(String ss:filteredName)
		{
			System.out.println(ss);
		}
		
		System.out.println("using set -----------------------");
		Set<String> filteredNam = al.stream().sorted().filter(arr->arr.startsWith("r")).collect(Collectors.toSet());
		for(String sa:filteredNam)
		{
			System.out.println(sa);
		}
		
		System.out.println("concat Mr to names .........");
		//foreach using stream
		List<String> concatMrNames = 
				al.stream().map(name -> "Mr. ".concat(name)).collect(Collectors.toList());
		for (String string : concatMrNames) {
			System.out.println(string);
		}
	}

}
