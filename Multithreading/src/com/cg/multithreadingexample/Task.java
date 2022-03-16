package com.cg.multithreadingexample;

public class Task extends Thread{
	public Task(ThreadGroup threadGroup,String name) {
		super(threadGroup,name);
	}
	@Override
	public void run() {
		boolean running = true;
		
		while(running) {
			try {
				System.out.println(getName() + " is running");
				Thread.sleep(1000,2000);
			} catch (InterruptedException e) {
				running = false;
				System.out.println(getName() + " is interrupted and then terminates");
			}
		}
	}

}
