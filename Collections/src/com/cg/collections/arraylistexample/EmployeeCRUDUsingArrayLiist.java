package com.cg.collections.arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeCRUDUsingArrayLiist {
	ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
	Employee employee;
	int noOfEmployees;
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	
	public void menu()  {

	try {
		while (ch == 'y') {

			System.out.println("Enter the choice .....");
			System.out.println("add : to add employee in the array");
			System.out.println("update:to update employee in the array");
			System.out.println("delete:to delete employee in the array");
			System.out.println("display: to display all employee");
			System.out.println("search: to search for a employee");
			sc.nextLine();
			String choice = sc.nextLine();
			switch (choice) {
			case "add":
				addEmployee();
				break;
			case "update":
				updateEmployee();
				break;
			case "delete":
				deleteEmployee();
				break;
			case "display":
				displayEmployee();
				break;
			case "search":
				searchEmployee();
				break;
			default:
				System.out.println("Not a proper choice");
				break;
			}

			System.out.println("do you want to continue....");
			System.out.println("Enter 'y' to continue ......");
			ch = sc.next().charAt(0);

		} // while close
  }//try close
	catch (Exception e) {
		e.printStackTrace();
	}
}

	private void searchEmployee() {
		// TODO Auto-generated method stub
		
	}

	private void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

	private void updateEmployee() {
		// TODO Auto-generated method stub
		
	}


	private void displayEmployee() {
		System.out.println("employee details to display.....");
		// display the student data
		System.out.println("employee Id" + "\t" + "employee Name" + "\t" + "employee DOB");
		for (int i = 0; i < noOfEmployees; i++) {	
			System.out.println(listOfEmployee.get(i).getEmployeeId() + "\t\t" +listOfEmployee.get(i).getEmployeeName()+ "\t\t" +listOfEmployee.get(i).getEmployeeDob() );
		}
		
	}

	private void addEmployee() {
		System.out.println("Enter the number of employee");
		noOfEmployees = sc.nextInt();
		System.out.println("Enter the employee details");
		// creating and adding student objects in the above array list
		
		for (int i = 0; i < noOfEmployees; i++) {
			employee = new Employee();
			employee.readEmployeeDetails();
			System.out.println(employee);
			listOfEmployee.add(employee);
			System.out.println(listOfEmployee);
		}
		
	}


}
