package assignementoperators;

public class Assignement_Operators {

	public static void main(String[] args) {
		int valueOne = 10;
		int valueTwo = 20;
		System.out.println("Addition is = "+(valueOne += valueTwo));
		System.out.println("subtraction is = "+(valueOne -= valueTwo));

		System.out.println("Multiplication is = "+(valueOne *= valueTwo));
		System.out.println("Division  is = "+(valueOne /= valueTwo));


	}

}
