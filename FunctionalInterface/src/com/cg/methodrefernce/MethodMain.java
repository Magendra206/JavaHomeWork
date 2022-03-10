package com.cg.methodrefernce;

public class MethodMain {

	public static void main(String[] args) {
		Message msg = Hello::saySomething;
		msg.showMessage();

	}

}
