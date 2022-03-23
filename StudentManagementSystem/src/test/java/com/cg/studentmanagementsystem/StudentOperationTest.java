package com.cg.studentmanagementsystem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StudentOperationTest {

	StudentOperations sop = null;
	List<Student> stdListForTest = null;
	Student s1 = null;
			Student s2 = null;
					Student s3 = null;
	@Before
	public void setUp() throws Exception{
		sop = new StudentOperations();
		stdListForTest = new ArrayList<Student>();
		s1 =  new Student(123, "Rama", 50.5f);
		s2 =  new Student(124, "Raheja", 70.5f);
		s3 =  new Student(125, "Rai", 80.5f); 
		stdListForTest.add(s3);
		stdListForTest.add(s1);
		stdListForTest.add(s2);
		//stdListForTest = sop.listOfStudents();
	}
	
	@Test
	public void listOfStudentsTest() throws StudentException {
		
		assertEquals(sop.listOfStudents(), stdListForTest);
	}
	
	@After
	public void tearDown() throws Exception{
		sop = null;
		stdListForTest = null;
	}
	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();
	
	@Test
	public void whenExceptionThrown() throws StudentException {
		exceptionRule.expect(StudentException.class);
		exceptionRule.expectMessage("List is empty");
		if(sop.listOfStudents() == null) {
			throw new StudentException("List is empty");
		}
}
}
