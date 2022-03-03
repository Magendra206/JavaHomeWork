package arraypractice;

import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		String rollNo;
        float s1,s2,s3;
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=8; i++){
                System.out.print("Enter Your Roll Number: ");
                rollNo = sc.next();

                System.out.print("Enter Your First Subject Mark: ");
                s1 = sc.nextFloat();
                System.out.print("Enter Your Second Subject Mark: ");
                s2 = sc.nextFloat();
                System.out.print("Enter Your Third Subject Mark: ");
                s3 = sc.nextFloat();

                float avg = (s1 + s2 + s3) / 3;

                if(s1<=100 && s2<=100 && s3<=100){
                    System.out.println("the avg marks is "+ avg);
                }
                else{
                    System.out.println("Please Enter Your Marks Between 0 to 100");
                }
            }

	}

}
