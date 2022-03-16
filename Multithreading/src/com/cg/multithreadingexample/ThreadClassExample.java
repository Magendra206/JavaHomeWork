package com.cg.multithreadingexample;

public class ThreadClassExample extends Thread {
	@Override
	public void run() {
		System.out.println("Run method is started......");
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadClassExample tce = new ThreadClassExample();
		tce.start();
		Thread.sleep(6000);
		ThreadClassExample tce1 = new ThreadClassExample();
		tce1.setDaemon(true);
		tce1.start();
		if (tce1.isDaemon()) {
			System.out.println("Yes....I am daemon thread");
		}else {
			System.out.println("Yayy!!! I am not a daemon thread");
		}
		
		
		
	}

}
