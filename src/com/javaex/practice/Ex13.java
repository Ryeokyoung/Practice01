package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main (String[] args) { 
		
		System.out.println("환전할 원화를 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		
		double won = sc.nextDouble();
		final double ex = 1230.95;
		double doller = won/ex;
		
		System.out.println("받으실 달러는"+doller);
		
		sc.close();
	}
}
