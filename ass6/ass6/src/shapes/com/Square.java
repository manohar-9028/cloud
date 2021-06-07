package shapes.com;

public class Square extends Shape{
	
	private int side;
	public Square(int x,int y,int side)
	{
		super(x,y);
		this.side=side;
	}
	
	public void Shape() {
		System.out.println("Rectangle");
	}

	@Override
	public double area() {
		double a;
		a=side*side;
		System.out.println("Area="+a);
		return a;
	}

	@Override
	public String toString() {
		return super.toString()+ side;
	}
	
	

}
