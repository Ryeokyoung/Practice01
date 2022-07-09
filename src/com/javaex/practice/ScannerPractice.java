package com.javaex.practice;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] agrs) {

		//System.out.println("aa");
		//system out 내보내기 
		//system in 입력 
		
		/***** Scanner scan = new Scanner(System.in) //콘솔창에 입력받아 넣기 
		 * 문자로 받고 싶으면 sc.nextLine, sc.next
		 * 숫자(정수,실수......) sc.nextInt, sc.nextdouble
		 * 
		 * ex ) 월급 => 연봉 출력 
		 *      반지름 => 원넓이 출력 
		 *      
		      System.out.println("월급얼마?");
		      Scanner sc = new Scanner(System.in);
		       int salary = sc.nextInt();
		       int mmm = 12*salary;
		       System.out.println("연봉은"+mmm+"입니다."); */
				
				System.out.println("반지름얼마?");
				Scanner sc = new Scanner(System.in);
				double rd= sc.nextDouble(); 
				final double PI =  3.14;
				double nm = PI*rd*rd;
						
						System.out.println(nm);
						
						sc.close();
						
						
						

//String str = "안녕하세요 저는 홍길동입니다.	\n 잘 부탁합니다.";
		// \n: 줄바꿈 

		// 입력값 - 스캔
//Scanner scan = new Scanner(str);// 스캔할 대상(str) 넣기
/*
		String str4 = scan.nextLine(); 
		System.out.println(str4); //줄 바꿈 전까지 읽어오기 
		
		
		System.out.println("===========================");
		
		String str5 = scan.nextLine(); 
		System.out.println(str5); //줄 바꿈 전까지 읽어오기 
		
		
		*/
		
		
		//스캔대상의 공백까지만 
		/*
		String str1 = scan.next(); // 스캔대상(scan에 담긴 str에 대한 내용 중, 첫번째 공백까지 읽음 //'안녕하세요 ')

		System.out.println(str1);

		String str2 = scan.next(); // 읽어온 내용을 제외 나머지 자료의 공백까지만 print

		System.out.println(str2);

		String str3 = scan.next(); // 읽어온 내용을 제외 나머지 자료의 공백까지만 print

		System.out.println(str3);
		*/
		
	
	
	}
}
