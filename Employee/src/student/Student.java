package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
	int studentId;
	String studentName;
	Date studentDob;
	String studentMobNo;
	String studentEmail;
	
	
	
	Scanner sc  = new Scanner(System.in);
	void readStudentDetails() throws ParseException {
		System.out.println("Enter the Student data");
		System.out.println("Enter the student id");
		studentId = sc.nextInt();
		System.out.println("Enter the student name");
		sc.nextLine();
		studentName = sc.nextLine();
		System.out.println("Enter the student dob in 'dd/MM/yyyy' ");
		String dob = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		studentDob = sdf.parse(dob);
		System.out.println("Enter the Student Mobile Number......");
		studentMobNo =  sc.nextLine();
		if(studentMobNo.matches("\\d{10}")) {
			System.out.println("Mobile Number is valid");
		}
		if(checkMobileNumber(studentMobNo)) {
			System.out.println("Mobile Number is valid");
		}else {
			System.out.println("Entered Mobile number is not valid ....");
			System.out.println("Do you want Enter Mobile number which is  valid (y/n)....");
			char ch = sc.next().charAt(0);
			if(ch== 'y') {
				System.out.println("Enter mobile number in specified format (ex:- 07892333222 / 917892333222)");
				sc.nextLine();
				studentMobNo =  sc.nextLine();
			}else {
				System.out.println("Thank you for providing your details.....");
			}
		}
		
		System.out.println("Enter the Student Email......");
		studentEmail =  sc.nextLine();
		if(validate(studentEmail)) {
			System.out.println("Thank you for providing correct email.....");
		}else {
			System.out.println("Enter email in specified format (ex:- swapna@gmail.com)");
		}
	}
	
	@SuppressWarnings("deprecation")
	void displayStudentDetails(){
		System.out.println("Entered the Student data ...............");
		System.out.println("Student id = " + studentId );
		System.out.println("Student name = " + studentName);
		System.out.println("Student dob = " + studentDob.getDate()+"/"+studentDob.getMonth()+"/"+studentDob.getYear());
		System.out.println("Student MobNo = " + studentMobNo);
		System.out.println("Student Email = " + studentEmail);
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
