package com.javaex.practice;

public class Ex06 {
	
	public static void main (String[] args) {
		
		int i = 10;
		int n = i++%2; //0 10/2의 나머지는 0이라서 "%"는 나머지를 결과값으로 받아냄 
		
		System.out.println(i); //11
		System.out.println(n); //0 
	
		
	}
}
