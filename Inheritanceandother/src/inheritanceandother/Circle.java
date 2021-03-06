package inheritanceandother;

public class Circle extends Shape {
	double radious = 1.0;
	static double pi = 3.14;

	public Circle() {
		super();
	}

	public Circle(double radious) {
		this.radious = radious;
	}
	

	public Circle(double radious ,String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public double getRadious() {
		return radious;
	}

	public void setRadious(double radious) {
		this.radious = radious;
	}
	public double getArea(double radious)
	{
		double area = pi*radious*radious;
		return area;
		
	}
	public double getPerimeter(double radious)
	{
		double perimeter = 2*pi*radious;
		return perimeter;
	}

	@Override
	public String toString() {
		return "Circle [radious=" + radious + "]";
	}
	
	

}
