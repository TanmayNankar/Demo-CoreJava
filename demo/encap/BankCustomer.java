package com.cg.demo.encap;

//Encapsulation - binding data and code together.
//Make field as private 

public class BankCustomer {

	double balance;
	
	
	double checkbalance() {
		return balance;
	}
	
	
	
	double withdraw(double amount) {
		
		balance -= amount;
		return balance;
	}
 
	double deposit(double amount) {
		
		balance += amount;
		return balance;
	}
}
