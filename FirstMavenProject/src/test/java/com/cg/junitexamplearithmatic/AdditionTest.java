package com.cg.junitexamplearithmatic;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class AdditionTest {
	
	Addition a = new Addition();
	@Test
	public void testAdd()
	{
		assertEquals(9,a.add(4,5));
	}
	
	@Test
	public void testAddWithZero()
	{
		assertEquals(0, a.add(0, 0));
	}
	
	@Test
	public void testAddWithNegativeValue()
	{
		assertEquals(-9, a.add(-5, -4));
	}
	
	@Test
	public void testAddWithNegativeOutput()
	{
		assertEquals(-9, a.add(5, 5));
	}
	
	@Test
	public void testAddWithAssertNotEqual()
	{
		assertNotEquals(-9, a.add(6, 6));
	}

}
