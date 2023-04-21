package com.Edubridge;

abstract class Shape
{
	abstract void area(int r);
	
}

class Circle extends Shape
{

	@Override
	void area(int r) {
		// TODO Auto-generated method stub
		
		System.out.println("The area of circle is:"+(3.14*r*r));
	}
	
}
class Circumeference extends Circle
{

	@Override
	void area(int r) {
	super.area(r);
		System.out.println("The area of circumference is"+(2*3.14*r));
	}
	
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circumeference c1=new Circumeference();
		c1.area(4);
	}

}
