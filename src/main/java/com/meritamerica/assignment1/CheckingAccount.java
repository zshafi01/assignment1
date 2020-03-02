package com.meritamerica.assignment1;
public class CheckingAccount {
	
	private double  balance;
	public  double interestRate=0.0001;
	private double  futureValue;
	private int year;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	public double getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}
	//deposite method
	public boolean deposit(double amount)
	{
		if(amount>0) {
			this.balance=this.balance + amount;
			return true;
		}else {
			return false;
		}
		
		
	}
	
	//withdow method
	public boolean withdraw(double amount)
	{
		if(balance>=amount) {
			this.balance=this.balance - amount;
			return true;
		}else {
			return false;
		}
	}
	
	
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		interestRate = interestRate;
	}
	//futurebalance method
	public double futureValue(int year) {
		this.year=year;
		this.futureValue= this.balance * Math.pow((1+ this.interestRate),year);
		return this.futureValue;
	}
	@Override
	public String toString() {
		return "Checking Account Balance: " + this.balance +
				"\n Checking Account Interest Rate" + this.interestRate +
				"\n Checking Account Balance in " + this.year +   "years: " + this.futureValue
				;
	}
	

	
	
	
	}
