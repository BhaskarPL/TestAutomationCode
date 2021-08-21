package com.icici.loans.carloans;

public interface Rbi
{

	int x=100;
	public void withdrawl(); // Method end with semicolon,method proto type, abstartc menthod,
	public void deposit();// 
	
	public static void main(String[] args) 
	{
		 Rbi i;  // Interface Reference Variable 
		 Rbi h;
		Rbi1 si;
		Rbi1 sh;
		
		 i=new Icici();
		 
         i.deposit();
         i.withdrawl();
         
         h= new Hdfc();
          
         h.deposit();
         h.withdrawl();
         
         si=new Icici();
         si.statement();
         
         sh=new Hdfc();
         sh.statement();
         
         
	}
	
}

