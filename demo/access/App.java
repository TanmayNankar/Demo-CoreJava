package com.cg.demo.access;

//import com.cg.method.DemoClass;
//import com.cg.method.Employee;
//or we can use one import statement for all
import com.cg.method.*;
public class App {

	public static void main(String[] args) {
		DemoClass obj = new DemoClass();
		System.out.println(obj.publicField);
//		System.out.println(obj.protectedField);
//    	System.out.println(obj.packageField);
//    	System.out.println(obj.privateField);
		
		Employee emp = new Employee();
	}
}
