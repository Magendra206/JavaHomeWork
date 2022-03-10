package com.cg.methodreference.instance;

public class InstanceReferenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EpsonPrinter ep = new EpsonPrinter();
		Printer p = ep::printUsingEpson;
		p.printData();

	}

}
