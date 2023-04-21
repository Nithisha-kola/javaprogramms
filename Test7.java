package com.Edubridge;




interface i1
{
	void showi1();
	
}
interface i2{
	void showi2();
}

//acheving multiple inheritance functionality
interface i3 extends i1,i2{
	void showi3();
}
class Demo  implements i3
{

	@Override
	public void showi1() {
		System.out.println("This is show 1 method");
		
	}

	@Override
	public void showi2() {
		System.out.println("This is show 2 method");
		
	}

	@Override
	public void showi3() {
		System.out.println("This is show 3 method");
		
	}
	
}
public class Test7 {

	public static void main(String[] args) {
		Demo d1=new Demo();
		
		d1.showi1();
		d1.showi2();
		d1.showi3();

	}

}