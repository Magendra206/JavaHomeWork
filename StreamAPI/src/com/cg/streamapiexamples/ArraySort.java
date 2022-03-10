package com.cg.streamapiexamples;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] arr = new int[] {2,4,3,6,10,12,5};
		
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::println);
		System.out.println("-----------------");
		Arrays.stream(arr).filter(v->(v>5)).forEach(System.out::println);

	}

}
