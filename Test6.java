package com.Edubridge;


//Bydefault methods are abstract in interface
interface  printdata{
	void print(int i);
	
}


class table implements printdata{

	@Override
	public void print(int i) {
		// TODO Auto-generated method stub
		
		
		System.out.println(i);
		
	}
	

	
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table t1=new table();
		t1.print(5);
	}

}
