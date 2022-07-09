package com.javaex.practice;

public class Ex03 {

	public static void main(String[] agrs) { 
		
		int x = 1; 
		int y = 1; 
		
		System.out.println(x);
		System.out.println(y);
		
		
		int a = ++x*2; // 2*2 = 4 
		int b = y++*2; // 2 => y는 나중에 ++이 계산되어 2로 나타남 
		
		System.out.println("a=" + a); 
		System.out.println("b=" + b);
		System.out.println("x=" + x);
		System.out.println("y=" + y); //2
	
	
	}
}
