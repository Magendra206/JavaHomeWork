package polymorphism;

public class ContractEmployee extends Employee {
	public ContractEmployee() {
		System.out.println("Contract Employee Constructor......called...");

	}
	float salary;
	
	@Override 
	void calculateSalary() {	
		System.out.println("ContractEmployee Salary details are ....");
	}
	
	void printEmployeeDetails(int a) {
		System.out.println("Contract Employee details are ....");
	}

}
