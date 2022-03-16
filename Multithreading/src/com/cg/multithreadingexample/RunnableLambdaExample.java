package com.cg.multithreadingexample;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Thread.currentThread().getName() + "......Running Test!!!!!");
		
		Runnable rti = () -> {
			System.out.println("Current THread = " + Thread.currentThread().getName()+ " Thread is Running");
		};
		
		Thread t1 = new Thread(rti, "Rama");
		
		Thread t2 = new Thread(rti, "Krishna");
		
		Thread t3 = new Thread(rti, "Shiva");
		
		Thread t4 = new Thread(rti); //Thread - 0
		Thread t5 = new Thread(rti); // Thread - 1
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e1) {
			System.out.println();
			e1.printStackTrace();
		}
		t2.start();
		t3.start();
		try {
			Thread.sleep(6000); // 6 second
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
		try {
			t4.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t5.start();

		System.out.println("Current THread = " + Thread.currentThread().getName()+ " Thread is Running");


	}

}
