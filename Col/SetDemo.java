package com.cg.demo.Col;
import java.util.*;
import java.util.Set;
//import java.util.HashMap;
//import java.util.Map;

// In Set the duplicate value can not be accessible

public class SetDemo {

	public static void main(String[] args) {
		
		
		Set<Integer> mySet = new HashSet <Integer>();
		
		mySet.add(10);
		mySet.add(50);
		mySet.add(10);
		mySet.add(20);

	System.out.println(mySet);	
		
		
	}
	
	
}
