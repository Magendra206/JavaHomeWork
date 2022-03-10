package com.cg.functionalintefaceexamples;


@FunctionalInterface
interface Car
{
	public String bookCar(String source, String Destination);
}

public class CabLambda {

	public static void main(String[] args) {
		Car car = (source,destination) ->{
			System.out.println("Uber is booked from "+source + "To" +destination);
			return ("Proce = 5000rs");
		};
		System.out.println(car.bookCar("Hydrabad", "Bombay"));
		

	}

}
