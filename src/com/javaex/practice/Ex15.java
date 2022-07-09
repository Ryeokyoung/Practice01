package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	
	public static void main (String[] args) {
		
		System.out.println("마일을 입력하세요");
		Scanner sc = new Scanner (System.in);
		
		double mi = sc.nextDouble();
		final double ex = 1.609;
		double km = ex*mi;
		
		System.out.println(mi+"마일은"+km+"킬로미터입니다.");
		
		sc.close();
	}

}
