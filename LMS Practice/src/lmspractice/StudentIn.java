package lmspractice;

public class StudentIn {
	private int studentId;
	private String studentName;
	private String college;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public void getDetails()
	{
		System.out.println("Student ID :"+ getStudentId() + " \n"+"Student Name :"+getStudentName() +"\n "+"college :"+getCollege());
	}

}
