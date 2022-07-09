package com.javaex.practice;

public class Ex09 {

	public static void main (String[] args) { 
		
		
		double f = 80.0; 
		System.out.println(f-32.0); //48
		System.out.println((double)5/9*(f-32.0));
		//5와 9는 정수처리되므로 실수처리해야함 
		//System.out.println(5/9*(f-32.0)); //결과값 0.0   정상값 26.666666
	}
}
