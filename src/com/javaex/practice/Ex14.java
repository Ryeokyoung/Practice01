package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로를 입력하세요");
		double ho = sc.nextDouble();
		
		System.out.println("세로를 입력하세요");
		double ve = sc.nextDouble();
		
		double area = ve*ho;
		System.out.println("사각형의 넓이는 "+area);
		
		double pe = (ve+ho)*2;
		System.out.println("사각형의 둘레는 "+pe);
	
		sc.close();
	
	}

}
