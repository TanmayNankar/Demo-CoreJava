package com.cg.demo;

class SS{
  final public double calArea() {
	return 1.2;	
	}
}

public class Circle extends SS {
	int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	public double calArea()
	{
		return 3.142*radius*radius;
	}
	public static void main(String[] args) {
		Circle obj = new Circle(5);
		System.out.println(obj.calArea());
	}

}