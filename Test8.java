package com.Edubridge;


abstract class Product
{//The abstract method disp in type Product can only set a 
	//visibility modifier, one of public or protected u cant set private
	protected abstract void disp();
	
}

class ProductInfo extends Product{

	@Override
	protected void disp() {
		// TODO Auto-generated method stub
		System.out.println("This is disp method");
	}
	
	
}
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductInfo p1=new ProductInfo();
		
		p1.disp();
	}

}
