package com.cg.multithreadingexample;

public class ThreadJoinExample implements Runnable {

	@Override
	public void run() {
		for(int i = 1;i <= 10;i++) {
			System.out.println("This is the message $$$ " +i);
			
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					System.out.println("I am about to stop......");
					return;
				}
			}
		}
}
