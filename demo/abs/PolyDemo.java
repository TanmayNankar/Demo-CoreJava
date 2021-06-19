package com.cg.demo.abs;

//polymorphism  
//compile time - method overloading - early binding
//possible in both static and non static both
//with static method possible only in one class
//with non static possible with one class,  or super + sub class
//3types- 1.no. of arguments
//2.types of arguments
//3.order of arguments
//
// run time polymorphism - method overriding - late binding
//possible only with non static
//possible only in super +sub class
//complete method signature is same 



public class PolyDemo {
// 1.no. of argument
	public int add(int i, int j) { // signature is different
		return i + j;
	}

//1.no. of argument
	public int add(int i, int j, int k) {
		return i + j + k;
	}

//2.type of argument - different signature
	public int add(int i, byte j) { // signature is different
		return i + j;
	}

//3.order of argument
	public int add(byte i, int j) { // signature is different
		return i + j;
	}

	public static void main(String[] args) {

		PolyDemo polydemo = new PolyDemo();
		System.out.println(polydemo.add(10, 20));
		System.out.println(polydemo.add(10, 20, 30));
        byte arg1 = 10;
        int arg2 =20;
        System.out.println(arg1);
        System.out.println(arg2);
       System.out.println("Hello");
	}
}
