package inheritance;

public class Student extends Person{

	public Student(String Programe,int year,double fee) {
		super(Programe, year,fee);
		// TODO Auto-generated constructor stub
	}
	String programe;
	int year;
	double fee;
	public String getPrograme() {
		return programe;
	}
	public void setPrograme(String programe) {
		this.programe = programe;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Student [programe=" + programe + ", year=" + year + ", fee=" + fee + "]";
	}
	

}
