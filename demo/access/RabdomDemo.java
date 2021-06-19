package com.cg.demo.access;
import java.util.Random;
import java.util.Scanner;
public class RabdomDemo {
	public static void main(String[] args) {
		
		Random random = new Random();
			
		int num = random.nextInt(100);//100-is the value is the range in which output is between
		System.out.println(num);
	}

}
