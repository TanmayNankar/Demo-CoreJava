package com.cg.demo.multi;

public interface SampleInterface {

	public abstract void anAbstarctMethod();

	public abstract void anotherAbstarctMethod();

	public static void aStaticMethod1() {
		System.out.println("aStaticMehtod");
	}

	public static void anotherStaticMethod1() {
		System.out.println("aStaticMehtod");
	}

	public default void aDefaultMethod() {
		System.out.println("aStaticMehtod");
	}

	public default void anotherDefaultMethod() {
		System.out.println("aStaticMehtod");
	}

}
