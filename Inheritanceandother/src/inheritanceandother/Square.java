package inheritanceandother;

public class Square  extends Shape{
	private double side;

	public Square() {
		super();
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square(double side,String color, boolean filled) {
		super(color, filled);
		// TODO Auto-generated constructor stub
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	public void setWidth(double side)
	{
		
	}
	public void setLength(double side)
	{
		
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	

}
