package com.cg.magendra.collectionhashmapexample;

public class Student {
	
	private String studentName;
	private float studentMarks;
	public Student() {
		
	}
	public Student(String studentName, float studentMarks) {
		super();
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getStudentMarks() {
		return studentMarks;
	}
	public void setStudentMarks(float studentMarks) {
		this.studentMarks = studentMarks;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentMarks=" + studentMarks + "]";
	}
	

}
