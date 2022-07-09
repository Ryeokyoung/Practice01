package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main (String[] args) {
		
		System.out.println("반지름을 입력하세요 :");
		
		Scanner sc = new Scanner(System.in);
		
		int ra = sc.nextInt();
		
		final double PI = 3.14;
		
		double answer = PI*ra*ra;
		
		sc.close();
		
		System.out.println ("원의 넓이는" +answer);
		
		
		
		
	}
}
