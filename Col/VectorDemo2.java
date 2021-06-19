package com.cg.demo.Col;

//import java.util.*;
import java.util.Vector;
import java.util.Enumeration;

public class VectorDemo2 {

	public static void main(String[] args) { 
		//increment
		Vector v = new Vector (3, 2); // initial capacity

// Vector<Integer>vector = new VectorList<>();
	
	System.out.println(v.capacity()); // intial capcity

	v.add(18);

	v.add(28);

	v.add(30);

	v.add(40);

	System.out.println(v.capacity()); // new capcity

	Enumeration e =v.elements();

	System.out.println("Vector elements are: "); 
	while (e.hasMoreElements()) {

	System.out.println(e.nextElement());



	}
}
}
