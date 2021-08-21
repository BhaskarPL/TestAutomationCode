package com.icici.loans.carloans;

public class Icici implements Rbi,Rbi1
{

	public static void main(String[] args)
	{
		Icici i = new Icici();
		
		i.deposit();
		i.withdrawl();
		i.statement();
				
	}

	@Override
	public void withdrawl()
	{
		System.out.println("Child is overridng withdrwal in ICICI");
		
	}

	@Override
	public void deposit()
	{

		System.out.println("Child is overridng deposit in ICICI");
	}

	@Override
	public void statement() 
	{
		System.out.println("Child is overriding statement in ICICI");
		
	}

}
