package com.cg.optionalclass;

public class Spaceship {

	private Engine engine;
	private String pilot;
	
	public Spaceship(Engine engine) {
		// TODO Auto-generated constructor stub
		this.engine = engine;
		
	}



	public Spaceship() {
		// TODO Auto-generated constructor stub
	}



	/*public SpaceShip() {
		// TODO Auto-generated constructor stub
	}*/
	
	

	/*public SpaceShip(Engine engine) {
		super();
		this.engine = engine;
	}*/



	/*public SpaceShip(Engine engine, String pilot) {
		super();
		this.engine = engine;
		this.pilot = pilot;
	}*/



	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getPilot() {
		return pilot;
	}

	public void setPilot(String pilot) {
		this.pilot = pilot;
	}



	@Override
	public String toString() {
		return "SpaceShip [engine=" + engine + ", pilot=" + pilot + "]";
	}
	
	
}
