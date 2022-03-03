package inheritanceandother;

public class HourlyEmployee extends Employee {
		
		float salaryPerHour;
		float totalSalaryPerWeek;
		float noOfHoursWorked;
		
		void readSalaryPerHour() {
			System.out.println("Enter the salary per hour");
			salaryPerHour = sc.nextFloat();
		}
		
		void readnoOfHoursWorked() {
			System.out.println("Enter the noOfHoursWorked");
			noOfHoursWorked = sc.nextFloat();
		}
		
		void calculateSalary() {	
			totalSalaryPerWeek =  salaryPerHour * noOfHoursWorked;
			System.out.println("Total Salary For a Week = " + totalSalaryPerWeek);
		}

	}

