package com.cg.demo.multi;

public class InterObj implements SampleInterface {

	public static void main(String[] args) {
		
		SampleInterface.aStaticMethod1();
		SampleInterface.anotherStaticMethod1();
		
		InterObj obj = new InterObj();
		obj.aDefaultMethod();
		obj.anotherDefaultMethod();
		
		obj.anAbstarctMethod();
		obj.anotherAbstarctMethod();
		
	}
}
