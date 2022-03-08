package com.cg.magendra.collectionhashmapexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.TreeSet;

public class HashMapEmployee {

	public static void main(String[] args) {
		HashMap<Integer, Employee> empData = new HashMap<Integer, Employee>();
		
		Employee e = new Employee(1, "azhar", 1000, 25, "it", "analyst");
		Employee e1 = new Employee(2, "vineeth", 2000, 26, "bu", "technical");
		Employee e2 = new Employee(3, "madhu", 3000, 27, "marketing", "business");
		
		empData.put(1, e);
		empData.put(2, e1);
		empData.put(3, e2);
		
		System.out.println(empData);
		
		//avg age of employees
		
		Collection<Employee> emp_value = empData.values();
		System.out.println(emp_value);
		int sum = 0 ;
		for(Employee emp : emp_value) {
			sum = sum + emp.getEmpage();
		}
		 int avg_age = sum/emp_value.size();
		System.out.println("Averagge of employee age  in HashMap = " + avg_age);
		
		//avg salary of all employee
		
		int sum1 = 0;
		for(Employee emp:emp_value)
		{
			sum1 = sum1 + emp.getEmpsalary();
		}
		int avg_salary = sum1 / emp_value.size();
		System.out.println("Average salary of employee = " +avg_salary );
		
		//highest age among all the employees
		
		TreeSet<Integer> emp_age = new TreeSet<Integer>();
		for(Employee emp:emp_value)
		{
			emp_age.add(emp.getEmpage());
		}
		System.out.println("Highest age of the employee =" +emp_age.last());
		
		//highest salary among all the employees
		
		TreeSet<Integer> emp_salary = new TreeSet<Integer>();
		for(Employee emp:emp_value)
		{
			emp_salary.add(emp.getEmpsalary());
		}
		System.out.println("Highest salary of the employee = "+emp_salary.last());
		
		
		//sorting the employee names
		TreeSet<String> emp_name = new TreeSet<String>();
		for(Employee emp:emp_value)
		{
			emp_name.add(emp.getEmpname());
		}
		System.out.println("employee names in sorted order" +emp_name);
		
		//sorting the employee department
		TreeSet<String> emp_dept = new TreeSet<String>();
		for(Employee emp:emp_value)
		{
			emp_dept.add(emp.getEmpdepartment());
		}
		System.out.println("employee department in sorted order "+emp_dept);
		
		//employee with designation "ceo" is contained or not
		
		TreeSet<String> emp_designation = new TreeSet<String>();
		for(Employee emp:emp_value)
		{
			emp_designation.add(emp.getEmpdesignation());
		}
		System.out.println("employee designations "+emp_designation);
		ArrayList<String> arr = new ArrayList<String>();
		arr.addAll(emp_designation);
		
		System.out.println(arr.contains("ceo"));
		
		/*for(String s:emp_designation)
		{
			if(s.contains("ceo"))
			{
				System.out.println("employee with designation found");
			}
			else
			{
				System.out.println("employee with designation not found");
			}
			
		}*/
		
		

	}

}
