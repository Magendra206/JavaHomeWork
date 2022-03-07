package lmspractice;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Input");
		String str = scan.next();
		System.out.println("enter studentid");
		int studentId = scan.nextInt();
		if(str.equalsIgnoreCase("student"))
		{
			StudentIn si = new StudentIn();
			//si.getDetails();
			si.setStudentId(studentId);
			si.setStudentName("magendra");
			si.setCollege("SVU");
			si.getDetails();

		}
		else if(str.equalsIgnoreCase("engineeringstudent"))
		{
			EngineeringStudent es = new EngineeringStudent();
			es.setStudentId(2);
			es.setStudentName("magendra");
			es.setCollege("svu");
			es.setStream("computer");
			es.getDetails();
		}
		else
		{
			System.out.println("Invalid inpute");
		}
	}

}
