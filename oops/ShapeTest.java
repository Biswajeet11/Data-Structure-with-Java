package com.myjavapractce;


abstract class Shape{
	String color;
	 Shape(String color) {
		this.color=color;
	}
	 abstract double geometry();
	 abstract String design();
}

class Circle extends Shape{
	int radius;
	 Circle(String color,int radius) {
		super(color);
		this.radius=radius;
	}
	 
	 double geometry() {
		 double area=(Math.PI)*(Math.pow(radius, 2));
		return area;
	 }
	 
	 String design() {
		return "GOL";
	}
	 
	 public String toString() {
		 return "Color is "+color+ "Geometry is "+geometry()+" "+ design();
	 }
}
class Rectangle extends Shape{
	
	int length;
	int width;
	
	Rectangle(String color,int length,int width) {
		super(color);
		this.length=length;
		this.width=width;
	}

	@Override
	double geometry() {
		double area= length*width;
		return area;
	}
	
	String design() {
		return "baxa";
	}
	 public String toString() {
			return "colour is:"+color+" Area is"+ geometry()+" "+ design();
			 
		 }
}

public class ShapeTest {
	public static void main(String args[]) {
		Rectangle r=new Rectangle("Red", 10, 20);
		Circle c=new Circle("Black", 20);
		System.out.println(r.toString());
		System.out.println(c.toString());
	}

}
