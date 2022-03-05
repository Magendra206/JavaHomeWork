package com.cg.collections.arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCRUDUsingArrayList {
	ArrayList<Student> listOfStudents = new ArrayList<Student>();
	Student student;
	int noOfStudents;
	Scanner sc = new Scanner(System.in);
	char ch = 'y';
	
	public void menu()  {

	try {
		while (ch == 'y') {

			System.out.println("Enter the choice .....");
			System.out.println("add : to add student in the array");
			System.out.println("update:to update student in the array");
			System.out.println("delete:to delete student in the array");
			System.out.println("display: to display all student");
			System.out.println("search: to search for a student");
			sc.nextLine();
			String choice = sc.nextLine();
			switch (choice) {
			case "add":
				addStudent();
				break;
			case "update":
				updateStudent();
				break;
			case "delete":
				deleteStudent();
				break;
			case "display":
				displayStudent();
				break;
			case "search":
				searchStudent();
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

	private void searchStudent() {
		// TODO Auto-generated method stub
		
	}

	private void displayStudent() {
		System.out.println("Student details to display.....");
		// display the student data
		System.out.println("Student Id" + "\t" + "Student Name" + "\t" + "Student DOB");
		for (int i = 0; i < noOfStudents; i++) {	
			System.out.println(listOfStudents.get(i).getStudentId() + "\t\t" +listOfStudents.get(i).getStudentName()+ "\t\t" +listOfStudents.get(i).getStudentDob() );
		}
		
	}

	private void deleteStudent() {
		
		
	}

	private void updateStudent() {
		
		
	}

	private void addStudent() {
		System.out.println("Enter the number of students");
		noOfStudents = sc.nextInt();
		System.out.println("Enter the student details");
		// creating and adding student objects in the above array list
		
		for (int i = 0; i < noOfStudents; i++) {
			student = new Student();
			student.readStudentDetails();
			System.out.println(student);
			listOfStudents.add(student);
			System.out.println(listOfStudents);
		}
		
	}



}
