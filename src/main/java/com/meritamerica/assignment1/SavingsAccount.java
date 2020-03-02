package com.meritamerica.assignment1;
public class SavingsAccount {
	
	private double  balance;
	public  double interestRate= 0.01;
	private double  futureValue;
	private int month;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	//method deposite
	public boolean deposit(double amount)
	{
		if(amount>0) {
			this.balance=this.balance + amount;
			return true;
		}else {
			return false;
		}
	}
	
	//method withdrow
	public boolean withdraw(double amount)
	{
		if(balance>=amount) {
			this.balance=this.balance - amount;
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	public double getFutureValue() {
		return futureValue;
	}
	public void setFutureValue(double futureValue) {
		this.futureValue = futureValue;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	//method futurebalance
	public double futureValue(int month) {
	this.month=month;
	
		this.futureValue=this.balance * Math.pow((1+this.interestRate), month);
		return this.futureValue;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return " Savings Account Balance:" + this.balance +
				"\n Savings Account Interest Rate: " + this.interestRate +
				"\n Savings Account Balance in" + (this.month/12)  + "years:" + this.futureValue;
				
	
	}
	}
