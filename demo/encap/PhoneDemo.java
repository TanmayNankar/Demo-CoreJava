package com.cg.demo.encap;

//Inheritance

class Phone {

	void call() {//method signature - what method ?
		System.out.println("Calling...");//method body- how ?
	}

	void sms() {
		System.out.println("Sending sms...");
	}

}

public class PhoneDemo {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.call();
		phone.sms();
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.music(); 
		//calling other class features in another class just by using extends.
		featurePhone.call();
		featurePhone.sms();
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.camera(); 
		smartPhone.call();
        
	}

}
