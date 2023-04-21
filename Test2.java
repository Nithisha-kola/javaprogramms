package com.Edubridge;

class Account
{
	private long acc_no;
	private float acc_amount;
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public float getAcc_amount() {
		return acc_amount;
	}
	public void setAcc_amount(float acc_amount) {
		this.acc_amount = acc_amount;
	}
	
	
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account();
		a1.setAcc_no(1001);
		a1.setAcc_amount(5000);
		
		System.out.println("The account No is:"+a1.getAcc_no());
		System.out.println("The account amount is:"+a1.getAcc_amount());
		
	}

}