package inheritanceandother;

public class EmployeeManagement {

	public static void main(String[] args) {
				
				HourlyEmployee hrEmployee = new HourlyEmployee();
				
				hrEmployee.readEmployeeDetails();
				hrEmployee.readSalaryPerHour();
				hrEmployee.readnoOfHoursWorked();
				hrEmployee.printEmployeeDetails();
				hrEmployee.calculateSalary();
				
				PermanentEmployee prEmployee = new PermanentEmployee();
				prEmployee.readEmployeeDetails();
				prEmployee.readSalaryPerMonth();
				prEmployee.readnoOfDayssWorked();
				prEmployee.printEmployeeDetails();
				prEmployee.calculateSalary();

	}

}
