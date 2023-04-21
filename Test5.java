package com.Edubridge;



abstract class vehicle
{
	vehicle()
	{
		System.out.println("This is vehicle default constructor");
	}
	
	abstract void speed(String s);
}
class Maruti extends vehicle
{

	@Override
	void speed(String s) {
		
		// TODO Auto-generated method stub
		System.out.println("The speed of maruti is:"+(s));
	}
	
}
class Bycycle extends Maruti
{
	Bycycle(){
		System.out.println("This is Byccycle constructor");
	}
	Bycycle( String color){
		System.out.println("This is Byccycle constructor"+color);
	}
	@Override
	
	void speed(String s) {
		super.speed(s);
		// TODO Auto-generated method stub
		System.out.println("The speed of Bycycle is:"+(s));
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bycycle b1=new Bycycle();
		
		b1.speed("100km");
		
		Bycycle b2=new Bycycle("red");
	}

}