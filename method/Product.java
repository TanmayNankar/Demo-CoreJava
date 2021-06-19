package com.cg.method;

public class Product {
		int id;
	    String ProductName;
	    double ProductPrice;
	    String ProductType;
		
	   
public Product() {
	    	
	    	super();
			// TODO Auto-generated constructor stub
		}

		public Product(int id, String productName, double productPrice, String productType) {
			super();
			this.id = id;
			ProductName = productName;
			ProductPrice = productPrice;
			ProductType = productType;
		}

//		@Override
//		public String toString() {
//			return "Product [id=" + id + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
//					+ ", ProductType=" + ProductType + "]";
//		}

		
//	    Product(int id,  String ProductName,double ProductPrice,String ProductType){ //argument constructor 
//	   	 this.id=id;
//	   	 this.ProductName=ProductName;
//	   	 this.ProductPrice=ProductPrice;
//	   	this.ProductType=ProductType;
//	   	 System.out.println(" parameterized constructor");
//	    }
//	    Product(int id, String ProductName,double ProductPrice){ //argument constructor 
//	   	 this.id=id;
//	   	 this.ProductName=ProductName;
//	   	this.ProductPrice=ProductPrice;
//	   	 System.out.println(" two parameterized constructor");
//	    }
//	   
//		
//		
//		public Product() {
//			System.out.println("Default Constructor");
//		}

//		@Override
//		public String toString() {
//			return "Product [id=" + id + ", ProductName=" + ProductName + ", ProductPrice=" + ProductPrice
//					+ ", ProductType=" + ProductType + "]";
		}
	    
