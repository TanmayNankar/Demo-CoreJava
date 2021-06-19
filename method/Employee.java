package com.cg.method;

/*
 * Constructor - 
 * It is used to create and initialize object.
 * It is a special type of method in Java. 
 * It does not have any return type. 
 * Constructor name is same as class name. 
 * By default, Java provides one default constructor.  
 * We can create our own constructors. 
 * If we create our constructors, Java does not provide any constructors. 
 * 
 * 
 * 
 */

public class Employee {
        //fields
	    int id;
	    String name;
	    double salary;
        
	    //constructor
	   public Employee(){
	    	System.out.println("default constructor");
	    }
	  
	    Employee(int id, String name){
	    	
	    //example of non static used in non static 	
	    	this.id=id;
	    	this.name=name;
	    	System.out.println(" id = " + id + " name = " +  name);
	    }
	     
	    Employee(int id, String name, double salary){
	    	
		    //non static used in non static 	
		    	this.id=id;
		    	this.name=name;
		    	this.salary=salary;
		    	System.out.println("parameterized constructor");
		    }

	    
	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	    }
  

}


