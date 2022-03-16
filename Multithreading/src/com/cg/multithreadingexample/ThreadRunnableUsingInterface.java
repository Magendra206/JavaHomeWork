package com.cg.multithreadingexample;

public class ThreadRunnableUsingInterface implements Runnable {
	@Override
	public void run() {
		System.out.println("Run method by implementing the runnable interface.......");
	}
	

	public static void main(String[] args) {
		ThreadRunnableUsingInterface tri = new ThreadRunnableUsingInterface();
		Thread th = new Thread(tri);
		th.start();
	}
		

	}
