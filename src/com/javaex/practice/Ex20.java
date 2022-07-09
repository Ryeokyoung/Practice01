package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main (String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("500원 개수:");
		System.out.println("100원 개수:");
		System.out.println("50원 개수:");
		System.out.println("10원 개수:");
		
		
		int won500 = sc.nextInt();
		int won100 = sc.nextInt();
		int won50 = sc.nextInt();
		int won10 = sc.nextInt();
		
		int sum = won500*500+won100*100+won50*50+won10*10;
		System.out.println("동전의 총합은"+sum+"원입니다.");
		
		sc.close();
		
	}
}
