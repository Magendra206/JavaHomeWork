package encapsulation;

public class Axis extends Bank {
	public void readAxisDetails() {
		System.out.println("Emter the Axis bank details");

		System.out.println("Enter the Simple Intrest ");
		simpleIntrest = sc.nextFloat();

		System.out.println("Enter the time in years");
		time = sc.nextFloat();

		System.out.println("Enter the principalAmount ");
		principalAmount = sc.nextFloat();
	}

	public void printAxisDetails() {
		System.out.println("Entered Axis bank details are");

		System.out.println("simpleIntrest = " + simpleIntrest);

		System.out.println(" time in years =" + time);

		System.out.println(" principalAmount = " + principalAmount);
		
		rateOfIntrest=(simpleIntrest*100)/(principalAmount*time);
		System.out.println("Rate Of intrest "+rateOfIntrest);
	}


}
