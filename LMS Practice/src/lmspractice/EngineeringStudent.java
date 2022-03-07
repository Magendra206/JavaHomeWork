package lmspractice;

public class EngineeringStudent  extends StudentIn{
	
	private String stream;
	

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}
	public void getDetails()
	{
		System.out.println("Student ID :"+getStudentId()+"\n"+"Student Name :"+getStudentName()+"\n"+"college : "+getCollege()+ "\n"+"Stream :"+getStream());
	}

}
