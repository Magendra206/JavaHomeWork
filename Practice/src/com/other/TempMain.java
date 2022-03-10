package com.other;

public class TempMain {
	public static void main(String[] args) {
		Temperature t = new Temperature(10, 20);
		Validator v = new Validator();
		System.out.println(v.validConversion(t));
		System.out.println(v.celciusToFahrenheit(10));

	}

}
