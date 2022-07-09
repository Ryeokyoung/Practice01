package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main (String[] args) {
		
		
		
		System.out.println("월급을 입력하세요:");
		
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		
		int mmm = 10*12*salary;
		
		sc.close();
		
		
		System.out.println("10년동안 최대 저축액은 " + mmm +"원 입니다");
	}

}
