package com.cg.collections.arraylistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentCRUDUsingArrayList {
	// ArrayList of Student Objects
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
			System.out.println("sort: to sort the student list");
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
				//deleteStudent();
				deleteStudentUsingSearch();
				break;
			case "display":
				displayStudent();
				break;
			case "search":
				searchStudent();
				break;
			case "sort" :
				sortStudent();
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

	private void sortStudent() {
		Collections.sort(listOfStudents);
		displayStudent();
	}

	private Student searchStudent() {
		System.out.println("Enter the student details to search...");
		System.out.println("Enter the student id to search...");
		int sId = sc.nextInt();
		for (int i = 0; i < listOfStudents.size(); i++) {
			if(listOfStudents.get(i).getStudentId() == sId) {
				student = listOfStudents.get(i);
				System.out.println("Student Id" + "\t" + "Student Name" + "\t" + "Student Email");
				System.out.println(listOfStudents.get(i).getStudentId() + "\t\t" +listOfStudents.get(i).getStudentName() + "\t\t" +listOfStudents.get(i).getStudentEmail() );
			}
		}
		return student;
	}

	private void displayStudent() {
		System.out.println("Student details to display.....");
		// display the student data
		System.out.println("Student Id" + "\t" + "Student Name" + "\t" + "Student Email");
		for (int i = 0; i < listOfStudents.size(); i++) {	
			System.out.println(listOfStudents.get(i).getStudentId() + "\t\t" +listOfStudents.get(i).getStudentName() );
		}
		
	}

	private void deleteStudent() {
		System.out.println("Enter the student details to delete");
		System.out.println("Enter the student id to delete");
		int sId = sc.nextInt();
	
		for (int i = 0; i < listOfStudents.size(); i++) {
			if(listOfStudents.get(i).getStudentId() == sId) {
				Student s = listOfStudents.get(i);
				System.out.println(s);
				if(listOfStudents.remove(s)) {
					System.out.println("Student removed successfully");
				}else {
					System.out.println("Student Not removed");
				}
				
			}
		}
		
		}
	private void deleteStudentUsingSearch(){
		
		student = searchStudent();
				 if(listOfStudents.remove(student)) {
					System.out.println("Student removed successfully");
				}else {
					System.out.println("Student Not removed");
				}
				
		}


	private void updateStudent() {
		Student student1 = searchStudent();
		if(student1 != null) {
			System.out.println("Enter the details to Modify .......");
			student1.readStudentDetails();
			//listOfStudents.add(student1);
		}
		
		
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
