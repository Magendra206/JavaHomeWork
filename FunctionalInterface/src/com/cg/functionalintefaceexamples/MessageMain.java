package com.cg.functionalintefaceexamples;

import com.cg.functinalinterface.Message;

public class MessageMain {

	public static void main(String[] args) {
		Message m = (quote) -> System.out.println(quote);
		
		m.thoughtOfTheDay("Hello World");

	}

}
