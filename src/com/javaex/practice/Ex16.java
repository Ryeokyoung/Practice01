package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main (String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품가격:");
		
		
		System.out.println("받은돈:");
		
		
		
		double nn = sc.nextDouble();
		double mm = sc.nextDouble();
		
		double vat = nn*0.1;
		double balance = mm-nn;
		
		
		System.out.println("받은돈:"+mm);
		System.out.println("상품가격:"+nn);
		System.out.println("부가세:"+vat);
		System.out.println("잔액:"+balance);
		
		
		sc.close();
	
		
	}
}
