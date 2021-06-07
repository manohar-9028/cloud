/*2: Solve assignment (to understand abstraction)
1. Create abstract class Shape --state :  x,y 
Abstract Method --public double area();
public String toString() : to ret x & y*/

package shapes.com;

public abstract class Shape {
	
	
		private int x;
		private int y;
		
		Shape(int x,int y)
		{
		this.x=x;
		this.y=y;
	    }
	public double area()
	{
		return 0;
	}
	
	public void show()
	{
		System.out.println("Inside Abstract Class");
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}
	
	


	
	
}
