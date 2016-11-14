package com.hanbin.main;

import com.hanbin.calculator.Calculator;

public class Init {
	public static void main(String[] args) {
		System.out.println("Hello");
		
		Calculator cal = new Calculator();
		
		int a = cal.sum(10, 2);
		int b = cal.minus(4, 6);
		
		System.out.println("a : " + a + ", b : " + b);
	}
}
