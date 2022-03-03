package encapsulation;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		b1.readDetails();
		b1.printDetails();
		
		Sbi s1=new Sbi();
		s1.readSbiDetails();
		s1.printSbiDetails();
		
		Icici i1= new Icici();
		i1.readIciciDetails();
		i1.printIciciDetails();
		
		Axis a1 = new Axis();
		a1.readAxisDetails();
		a1.printAxisDetails();

	}

}
