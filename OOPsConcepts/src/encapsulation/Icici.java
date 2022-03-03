package encapsulation;

public class Icici extends Bank {
	public void readIciciDetails() {
		System.out.println("Emter the ICICI bank details");

		System.out.println("Enter the Simple Intrest ");
		simpleIntrest = sc.nextFloat();

		System.out.println("Enter the time in years");
		time = sc.nextFloat();

		System.out.println("Enter the principalAmount ");
		principalAmount = sc.nextFloat();
	}

	public void printIciciDetails() {
		System.out.println("Entered ICICI bank details are");

		System.out.println("simpleIntrest = " + simpleIntrest);

		System.out.println(" time in years =" + time);

		System.out.println(" principalAmount = " + principalAmount);
		
		rateOfIntrest=(simpleIntrest*100)/(principalAmount*time);
		System.out.println("Rate Of intrest "+rateOfIntrest);

	}
}


