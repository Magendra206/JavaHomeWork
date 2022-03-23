package com.cg.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class StudentOperations {
	ArrayList<Student> stdList  = new ArrayList<Student>();
	
	public StudentOperations()
	{
		Student s1 = new Student(123, "Maggi", 99.2f);
		Student s2 = new Student(124,"Hello",98.7f);
		stdList.add(s2);
		stdList.add(s1);
	}

	public List<Student> listOfStudents() throws StudentException
	{
		if(stdList!=null)
			return stdList;
		else
		{
			throw new StudentException("Student list is not found");
		}
	}
}
