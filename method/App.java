package com.cg.method;

public class App {
	
	    public static void main(String[] args) {

	        int num = 10;

	 
         // class object = new constructor
	        Employee obj = new Employee();
	        obj.id = 101;
	        obj.name = "Abc";
	        obj.salary = 10.5;
	        System.out.println(obj.toString());

	        Employee obj2 = new Employee();
	        obj2.id = 102;
	        obj2.name = "Xyz";
	        obj2.salary = 18;
	        System.out.println(obj2.toString());
	        
	        Employee obj3 = new Employee();
	        obj3.id = 103;
	        obj3.name = "Pqr";
	        obj3.salary = 20;
	        System.out.println(obj3.toString());
	        
	        Employee obj4 = new Employee(104, "Tanm", 42.1);
	        System.out.println(obj4.toString());
            
	        Employee obj5 = new Employee(105, "Eee", 66);
	        System.out.println(obj5.toString());
	        
	        Employee obj6 = new Employee(106, "Eff");
	        System.out.println(obj6.toString());

	 

	    }

	 

	}
