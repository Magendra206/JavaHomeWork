package com.other;

public class Temperature {
	double celsius;
	double fahrenheit;

	Temperature(double a, double b) {
		this.celsius = a;
		this.fahrenheit = b;
	}
}

class Validator {
	public String validConversion(Temperature t) {
		Validator v = new Validator();
		double tf = v.celciusToFahrenheit(t.celsius);
		if (tf != t.fahrenheit) {
			try {
				throw new InvalidConversionException("Invalid Conversion");
			} catch (InvalidConversionException e) {
				return "" + e;
			}
		}
		return "Valid Conversion";
	}

	public double celciusToFahrenheit(double celcius) {
		return (celcius * 1.8) + 32;
	}
}

class InvalidConversionException extends Exception {
	public InvalidConversionException(String a) {
		super(a);
	}

}

