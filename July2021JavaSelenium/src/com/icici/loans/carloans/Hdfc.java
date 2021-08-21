package com.icici.loans.carloans;

public class Hdfc implements Rbi,Rbi1
{

	public static void main(String[] args)
	{
		Hdfc h = new Hdfc();
		h.deposit();
		h.withdrawl();
	}

	@Override
	public void withdrawl()
	{
		 System.out.println("I am Overriding withdrawal in Hdfc");
	}

	@Override
	public void deposit() {
		System.out.println("I am Overriding deposite Hdfc");
		
	}

	@Override
	public void statement()
	{
		
		System.out.println("I am Overriding statment Hdfc");
	}

}
