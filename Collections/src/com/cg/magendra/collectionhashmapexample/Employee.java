package com.cg.magendra.collectionhashmapexample;

public class Employee {
	private int empid;
	private String empname;
	private int empsalary;
	private int empage;
	private String empdepartment;
	private String empdesignation;
	public Employee(int empid, String empname, int empsalary, int empage, String empdepartment, String empdesignation) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.empage = empage;
		this.empdepartment = empdepartment;
		this.empdesignation = empdesignation;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public String getEmpdepartment() {
		return empdepartment;
	}
	public void setEmpdepartment(String empdepartment) {
		this.empdepartment = empdepartment;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", empage=" + empage
				+ ", empdepartment=" + empdepartment + ", empdesignation=" + empdesignation + "]";
	}
	
	
	

}
