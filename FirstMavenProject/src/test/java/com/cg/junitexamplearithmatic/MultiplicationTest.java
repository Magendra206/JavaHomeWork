package com.cg.junitexamplearithmatic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MultiplicationTest {
	Multiplication m = new Multiplication();
	
	@Test
	public void testMul()
	{
		assertEquals(6, m.mul(2, 3));
	}
	
	@Test
	public void testMulWithNegativeValue()
	{
		assertEquals(-10, m.mul(2, -5));
	}
	
	@Test
	public void testMulWithAsserNotEqual()
	{
		assertNotEquals(10, m.mul(2, 3));
	}

}
