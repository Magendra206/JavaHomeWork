package com.cg.studentmanagementsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTest {
	Student s = null;
	Student s1 = null;
	Student s2 = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("calling setUpBefore() class method before all testcases");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
        System.out.println("Calling tearDownAfterClass() method after all test cases/ test methods ...");
    }
	
	@Before
	public void setUp() throws Exception
	{
		//System.out.println("setUp() method is called before  each test method is called");
		s = new Student();
		s1 = new Student();
		s2 = new Student(123,"Rama",78.9f);
	}
	
	@After
	public void tearDown() throws Exception
	{
		//System.out.println("tearDown() method is called after each test method is called ");
		s = null;
		s1 = null;
		s2 = null;
	}
	
	@Test
	public void testStudent1()
	{
		//System.out.println("Test method 1 is called");
		//tested zero argument constructor
				assertEquals(s1.hashCode(), s.hashCode());
				//tested param constructor
				assertEquals(s2,new Student(123,"Rama",78.9f));
				//tested getter
				assertNotEquals(s2.getStudentId(), s1.getStudentId());
				//testing getters
				assertEquals(s2.getStudentId(), 123);
				assertEquals(s2.getStudentName(), "Rama");
				assertEquals(s2.getStudentMarks(), 78.9f,1);
	}
	

}
