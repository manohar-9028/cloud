/*2. Circle -- x,y,radius
Concrete overriding Method --public double area() : ret area of circle
public String toString() : ret x, y & radius*/
package shapes.com;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(int x,int y,int radius)
	{
		super(x,y);
		this.radius=radius;
	}
	public void Shape() {
		
		System.out.println("Circle");
		
	}

	@Override
	public double area() {
		double a=3.143*radius*radius;
		System.out.println("Area="+a);
		return a;
	}

	@Override
	public String toString() {
		return super.toString()+ radius;
	}

}
