package com.cg.optionalclass;

public class Engine {

private VelocityMonitor vMonitor;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public VelocityMonitor getvMonitor() {
		return vMonitor;
	}

	public void setvMonitor(VelocityMonitor vMonitor) {
		this.vMonitor = vMonitor;
	}

	public Engine(VelocityMonitor vMonitor) {
		super();
		this.vMonitor = vMonitor;
	}

	@Override
	public String toString() {
		return "Engine [vMonitor=" + vMonitor + "]";
	}
	
}
