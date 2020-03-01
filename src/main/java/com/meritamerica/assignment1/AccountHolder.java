package com.meritamerica.assignment1;
public class AccountHolder {
String fristName;
String MiddleName;
String lastName;
String SSN;
double checkingAccountOpeningBalance;
double savingsAccountOpeningBalance;
SavingsAccount savingAccount = new SavingsAccount();
CheckingAccount chackingAccount = new CheckingAccount();

public AccountHolder(String fristName, String MiddleName, String lastName, String socialSecurityNumber, double checkingAccountOpeningBalance,
double savingsAccountOpeningBalance) {
	this.fristName=fristName;
	this.MiddleName=MiddleName;
	this.lastName=lastName;
	this.SSN=socialSecurityNumber;
	//take the saving opning balance
	this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	//set to the saving account balance
	this.savingAccount.setBalance(savingsAccountOpeningBalance);
	
	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	this.chackingAccount.setBalance(checkingAccountOpeningBalance);

}

public String getFristName() {
	return fristName;
}

public void setFristName(String fristName) {
	this.fristName = fristName;
}

public String getMiddleName() {
	return MiddleName;
}

public void setMiddleName(String middleName) {
	MiddleName = middleName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getSocialSecurityNumber() {
	return SSN;
}

public void setSocialSecurityNumber(String socialSecurityNumber) {
	this.SSN = socialSecurityNumber;
}

public double getCheckingAccountOpeningBalance() {
	return checkingAccountOpeningBalance;
}

public void setCheckingAccountOpeningBalance(double checkingAccountOpeningBalance) {
	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
}

public double getSavingsAccountOpeningBalance() {
	return savingsAccountOpeningBalance;
}

public void setSavingsAccountOpeningBalance(double savingsAccountOpeningBalance) {
	this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
}

@Override
public String toString() {
	return " Name: " + fristName + " " + MiddleName + " " + lastName
			+ "\n SSN: " + SSN + 
			chackingAccount.toString()+
			savingAccount.toString() +
			"";
}





}
