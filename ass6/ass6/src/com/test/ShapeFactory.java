package com.test;
import java.util.Random;

import shapes.com.Circle;
import shapes.com.Rectangle;
import shapes.com.Square;

public class ShapeFactory {


	public static void generateShape()
	{
		
		Random r=new Random();
		int choice=r.nextInt(3);
		System.out.println(choice);
		
		switch(choice)
		{
		case 1:Circle c=new Circle(10,20,5);
		      System.out.println(c.area());
		      break;
		case 2:Rectangle re=new Rectangle(10,20,5,10);
				System.out.println(re.area());
		         break;
		case 3:Square s=new Square(10,20,10);	
		       System.out.println(s.area());
		       break;
		}
	}
	}


