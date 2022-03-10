package com.cg.optionalclass;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spaceship falcon = new Spaceship();
		Optional<Spaceship> optionalFalcon = Optional.of(falcon);
		System.out.println(optionalFalcon);
		
		Spaceship falcon1 = new Spaceship(new Engine(new VelocityMonitor(500)));
		Optional<Spaceship> optionalFalcon1 = Optional.ofNullable(falcon1);
		System.out.println(optionalFalcon1);
		
		if(optionalFalcon1.isPresent()) {
			System.out.println(optionalFalcon1.get());
		}else {
			System.out.println("Object is null");
		}
		
		Spaceship falcon11 = null;
		Optional<Spaceship> optionalFalcon11 = Optional.ofNullable(falcon11);
		Spaceship result = optionalFalcon11.orElseThrow();
		System.out.println(result);

	}

}
