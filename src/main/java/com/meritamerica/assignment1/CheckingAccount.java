package com.meritamerica.assignment1;
public class CheckingAccount {
	
	private double  balance;
	public final double ANNUAL_INTEREST_RATE=0.01;
	private double  futureBalance;
	private int year;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public double getFutureBalance() {
		return futureBalance;
	}
	public void setFutureBalance(double futureBalance) {
		this.futureBalance = futureBalance;
	}
	//deposite method
	public void deposite(double amount)
	{
		this.balance=this.balance + amount;
	}
	
	//withdow method
	public void withdrow(double amount)
	{
		this.balance=this.balance - amount;
	}
	
	//futurebalance method
	public double calculatFutureBalance(int year) {
		this.year=year;
		this.futureBalance= this.balance * Math.pow((1+ this.ANNUAL_INTEREST_RATE),year);
		return this.futureBalance;
	}
	@Override
	public String toString() {
		return "Checking Account Balance: " + this.balance +
				"\n Checking Account Interest Rate" + this.ANNUAL_INTEREST_RATE +
				"\n Checking Account Balance in " + this.year +   "years: " + this.futureBalance
				;
	}
	

	
	
	
	}
