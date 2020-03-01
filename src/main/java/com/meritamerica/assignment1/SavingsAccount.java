package com.meritamerica.assignment1;
public class SavingsAccount {
	
	private double  balance;
	public final double ANNUAL_INTEREST_RATE= 1.00;
	private double  futureBalance;
	private int month;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//method deposite
	public void deposite(double amount)
	{
		this.balance=this.balance + amount;
	}
	
	//method withdrow
	public void withdrow(double amount)
	{
		this.balance=this.balance - amount;
	}
	
	//method futurebalance
	public double calcuatFutureBalance(int month) {
	this.month=month;
	
		this.futureBalance=this.balance * Math.pow((1+this.ANNUAL_INTEREST_RATE), month);
		return this.futureBalance;
	}
	@Override
	public String toString() {
		return " Savings Account Balance:" + this.balance +
				"\n Savings Account Interest Rate: " + this.ANNUAL_INTEREST_RATE +
				"\n Savings Account Balance in" + (this.month/12)  + "years:" + this.futureBalance;
				
	
	}
	}
