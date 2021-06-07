package shapes.com;

public class Rectangle extends Shape{
	
	private int w;
	private int h;
	
	public Rectangle(int x,int y,int w,int h)
	{
		super(x,y);
		this.w=w;
		this.h=h;
	}

	
	public void Shape() {
		System.out.println("Rectangle");
		
	}

	@Override
	public double area() {
		
		double a=w*h;
		System.out.println("Area="+a);
		return a;
	}

	@Override
	public String toString() {
		return super.toString()+w+h;
	}
}
