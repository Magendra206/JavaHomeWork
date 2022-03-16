package com.cg.multithreadingexample;

public class ThreadUsingRunnableInterfaceLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable rti = () -> {
			System.out.println("run method using runnable and lambda");
		};

		new Thread(rti).start();

	}

}
