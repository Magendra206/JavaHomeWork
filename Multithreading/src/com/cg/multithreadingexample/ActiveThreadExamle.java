package com.cg.multithreadingexample;

import java.util.Set;

public class ActiveThreadExamle {

	public static void main(String[] args) {
       Set<Thread> threads = Thread.getAllStackTraces().keySet();
		
		for(Thread t : threads) {
			String threadName = t.getName();
			Thread.State state = t.getState();
			int priority = t.getPriority();
			String type =  t.isDaemon() ? "Daemon" : "Normal";
			System.out.printf("%-20s \t %s \t %d \t %s \n",threadName,state,priority,type);
					
		}


	}

}
