package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main (String[] args) {
		
		System.out.println("반지름:");
		Scanner sc = new Scanner(System.in);
		
		double rd = sc.nextDouble();
		final double PI = 3.14;
		double bulk = (double)4/3*PI*(rd*rd*rd);
		
		System.out.println("구의 부피는 :"+bulk+"입니다.");
		
		sc.close();
	}
}
