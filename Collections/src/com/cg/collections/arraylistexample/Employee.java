package com.cg.collections.arraylistexample;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {

	private int employeeId;
	private String employeeName;
	private Date employeeDob;
	private String employeeMobNo;
	private String employeeEmail;
	public Employee() {
		super();
	}
	public Employee(int employeeId, String employeeName, Date employeeDob, String employeeMobNo, String employeeEmail) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDob = employeeDob;
		this.employeeMobNo = employeeMobNo;
		this.employeeEmail = employeeEmail;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getEmployeeDob() {
		return employeeDob;
	}
	public void setEmployeeDob(Date employeeDob) {
		this.employeeDob = employeeDob;
	}
	public String getEmployeeMobNo() {
		return employeeMobNo;
	}
	public void setEmployeeMobNo(String employeeMobNo) {
		this.employeeMobNo = employeeMobNo;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDob=" + employeeDob
				+ ", employeeMobNo=" + employeeMobNo + ", employeeEmail=" + employeeEmail + "]";
	}
	Scanner sc  = new Scanner(System.in);
	//methods to access above variables
	public void readEmployeeDetails() {
	 try {
		System.out.println("Enter the employee data");
		System.out.println("Enter the employee id");
		employeeId = sc.nextInt();
		System.out.println("Enter the employee name");
		sc.nextLine();//throw away the newline read by scanner
		employeeName = sc.nextLine();
		System.out.println("Enter the employee dob in 'dd/MM/yyyy' ");
		String dob = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		employeeDob = sdf.parse(dob);
		System.out.println("Enter the employee Mobile Number......");
		employeeMobNo =  sc.nextLine();
		if(employeeMobNo.matches("\\d{10}")) {
			System.out.println("Mobile Number is valid");
		}
		if(checkMobileNumber(employeeMobNo)) {
			System.out.println("Mobile Number is valid");
		}else {
			System.out.println("Entered Mobile number is not valid ....");
			System.out.println("Do you want Enter Mobile number which is  valid (y/n)....");
			char ch = sc.next().charAt(0);
			if(ch== 'y') {
				System.out.println("Enter mobile number in specified format (ex:- 07892333222 / 917892333222)");
				sc.nextLine();
				employeeMobNo =  sc.nextLine();
			}else {
				System.out.println("Thank you for providing your details.....");
			}
		}
		
		System.out.println("Enter the Student Email......");
		employeeEmail =  sc.nextLine();
		if(validate(employeeEmail)) {
			System.out.println("Thank you for providing correct email.....");
		}else {
			System.out.println("Enter email in specified format (ex:- swapna@gmail.com)");
		}
	 }catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	@SuppressWarnings("deprecation")
	void displayEmployeeDetails(){
		System.out.println("Entered the employee data ...............");
		System.out.println("employee id = " + employeeId );
		System.out.println("employee name = " + employeeName);
		System.out.println("employee dob = " + employeeDob.getDate()+"/"+employeeDob.getMonth()+"/"+employeeDob.getYear());
		System.out.println("employee MobNo = " + employeeMobNo);
		System.out.println("employee Email = " + employeeEmail);
	}
	
	boolean checkMobileNumber(String mobNo) {
		Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");
		Matcher match = ptrn.matcher(mobNo);
		return (match.find() && match.group().equals(mobNo));
	}
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

		public static boolean validate(String emailStr) {
		        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		        return matcher.find();
		}
}
