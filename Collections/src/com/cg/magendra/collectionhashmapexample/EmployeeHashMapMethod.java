package com.cg.magendra.collectionhashmapexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class EmployeeHashMapMethod {
	HashMap<Integer, Employee> empData = new HashMap<Integer, Employee>();
	
	void EmployeeHashmapMethods()
	{
		empData = new HashMap<Integer, Employee>();
		Employee e = new Employee(1, "azhar", 1000, 25, "it", "analyst");
		Employee e1 = new Employee(2, "vineeth", 2000, 26, "bu", "technical");
		Employee e2 = new Employee(3, "madhu", 3000, 27, "marketing", "business");
		
		empData.put(1, e);
		empData.put(2, e1);
		empData.put(3, e2);
		
		System.out.println(empData);
	}
	Collection<Employee> emp_value = empData.values();
	void avgOfEmployee()
	{
		emp_value = empData.values();
		int sum = 0 ;
		for(Employee emp : emp_value) {
			sum = sum + emp.getEmpage();
		}
		 int avg_age = sum/emp_value.size();
		System.out.println("Averagge of employee age  in HashMap = " + avg_age);
	}
	
	void avgSalaryOfEmployee()
	{
		int sum1 = 0;
		for(Employee emp:emp_value)
		{
			sum1 = sum1 + emp.getEmpsalary();
		}
		int avg_salary = sum1 / emp_value.size();
		System.out.println("Average salary of employee = " +avg_salary );
	}
	void highestAgeEmployee()
	{
		TreeSet<Integer> emp_age = new TreeSet<Integer>();
		for(Employee emp:emp_value)
		{
			emp_age.add(emp.getEmpage());
		}
		System.out.println("Highest age of the employee =" +emp_age.last());
	}
	void highestSalaryEmployee()
	{
		TreeSet<Integer> emp_salary = new TreeSet<Integer>();
		for(Employee emp:emp_value)
		{
			emp_salary.add(emp.getEmpsalary());
		}
		System.out.println("Highest salary of the employee = "+emp_salary.last());
	}
	void sortingTheEmployeeName()
	{
		TreeSet<String> emp_dept = new TreeSet<String>();
		for(Employee emp:emp_value)
		{
			emp_dept.add(emp.getEmpdepartment());
		}
		System.out.println("employee department in sorted order "+emp_dept);
	}
	void designationEmployee()
	{
		TreeSet<String> emp_designation = new TreeSet<String>();
		for(Employee emp:emp_value)
		{
			emp_designation.add(emp.getEmpdesignation());
		}
		System.out.println("employee designations "+emp_designation);
		ArrayList<String> arr = new ArrayList<String>();
		arr.addAll(emp_designation);
		
		System.out.println(arr.contains("ceo"));
	}

}
