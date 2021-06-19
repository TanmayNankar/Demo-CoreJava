package com.cg.method;

public class App2 {
	
	    public static void main(String[] args)
	    {
	    		int num = 10	;
	    		Product obj = new Product();
	    	        
	    	        obj.id = 1;
	    	        obj.ProductName = "Cadbury";
	    	        obj.ProductPrice = 10;
	    	        obj.ProductType = "Chocolate";
	    	        System.out.println(obj.toString());
	    	        
	    	        
	    	        Product obj4= new Product(2,"Rice",45.68,"Basmati");
	        		System.out.println(obj4.toString());
	        		
	        		
	        		 Product obj6= new Product(3,"Sugar",50);
	        		 System.out.println(obj6.toString());
	    	}

	   
}
	    
