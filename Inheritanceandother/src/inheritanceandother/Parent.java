package inheritanceandother;
 class Child
{
	int a = 100;
	public void display()
	{
		System.out.println("the output is "+a);
	}
}
 class Child1 extends Child
 {
	 int b= 200;
	 public void display()
	 {
		 System.out.println("the output is"+b);
	 }
 }



public class Parent {

	public static void main(String[] args) {
		Child obj = new Child1();
		obj.display();

	}

}
