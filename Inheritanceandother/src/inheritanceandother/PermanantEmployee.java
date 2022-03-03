package inheritanceandother;

import java.util.Scanner;

public class PermanantEmployee extends Employee {
	float salaryPerMonth;
	float totalSalaryPerMonth;
	float noOfDaysWorked;
	Scanner sc = new Scanner(System.in);
	
	void readSalaryPerMonth() {
		System.out.println("Enter the salary per hour");
		salaryPerMonth = sc.nextFloat();
	}
	
	void readnoOfDayssWorked() {
		System.out.println("Enter the noOfHoursWorked");
		noOfDaysWorked = sc.nextFloat();
	}
	
	void calculateSalary() {	
		totalSalaryPerMonth =  (salaryPerMonth/30) * noOfDaysWorked;
		System.out.println("Total Salary For a Week = " + totalSalaryPerMonth);
	}

}
