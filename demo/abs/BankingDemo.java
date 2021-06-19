package com.cg.demo.abs;

interface CentralGovtRule {

	public abstract void payInstrest();
}

interface StateGovtRule {
	public abstract void giveloan();
}

abstract class RBI {
	public abstract void dokyc();

	public abstract void openAccount();

	{
		System.out.println("Open account..");
	}

//	{ // what to do ?? not say how to do ??
//		System.out.println("Personal ID.");
//	}

}

class HDFC extends RBI implements CentralGovtRule, StateGovtRule { // concrete class
	public void dokyc() {
		System.out.println("Aadhaar");
	}

	public void giveLoan() {
		System.out.println("HDFC is giving loan..");
	}

	public void payInterest() {
		System.out.println("HDFC is pay Interest..");
	}

}



public class BankingDemo {

	public static void main(String[] args) {

	}
}
