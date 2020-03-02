package com.meritamerica.assignment1;
public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder accountHolder = new AccountHolder ("Zulikha", "Faris", "Shafi", "333-76-9990", 100.0, 1000.0);
	System.out.println(accountHolder.toString());
	accountHolder.checkingAccount.deposit(500);
	accountHolder.savingsAccount.withdraw(800);
	System.out.println("\n ******* checking acount info******");
	System.out.println( accountHolder.checkingAccount.toString());
	System.out.println("\n ******* saving acount info******");
	System.out.println( accountHolder.savingsAccount.toString());
	
	System.out.println("\n ******* another acount info******");
	AccountHolder accountHolder2 = new AccountHolder("Alemu", "Tesema", "Mignotu", "333-79-0987", 200.0, 500.0);
	System.out.println(accountHolder.toString());
	accountHolder.checkingAccount.deposit(500);
	accountHolder.savingsAccount.withdraw(600);
	
	System.out.println("\n ******* another checking acount info******");
	System.out.println( accountHolder2.checkingAccount.toString());
	System.out.println("\n ******* another saving acount info******");
	System.out.println( accountHolder2.savingsAccount.toString());
	}

}
