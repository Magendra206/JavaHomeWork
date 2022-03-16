package com.cg.multithreadingexample;

public class PrintANUmber implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintANUmber pan = new PrintANUmber();
		Thread th = new Thread(pan);
		th.start();
		
		try {
			Thread.sleep(3000);
			th.interrupt();
			/*
			 * if(th.isInterrupted()) { System.out.println("I am interrupted......");
			 * return; }
			 */
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		
		for(int i = 1;i <= 10;i++) {
			System.out.println("This is the message $$$ " +i);
			
			if(Thread.interrupted()) {
				System.out.println("I am interrupted......");
				return;
			}
		}

	}

}
