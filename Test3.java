package com.Edubridge;

abstract class Animal
{
	abstract void eating();
	
	void barking()
	{
		System.out.println("This is barking method");
	}
	
}
class DemoAnimal extends Animal
{

	@Override
	void eating() {
		// TODO Auto-generated method stub
		System.out.println("This is eating method");
	}
	 
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoAnimal d1=new DemoAnimal();
		
		d1.barking();
		d1.eating();
		
	}

}
