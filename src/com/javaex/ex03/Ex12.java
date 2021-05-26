package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		
		int month = sc.nextInt();
		
		//4 6 9 11 --> 30일
		//2        --> 29일
		//나머지   --> 31일
		
		switch (month) {
			case 4 :
			case 6 :
			case 9 : 
			case 11 :
				System.out.println("30일 입니다.");
				break;
				
			case 2 :
				System.out.println("29일 입니다.");
				break;
				
			default :
				System.out.println("31일 입니다.");
				break;
				
		}
			
		
	
			

		sc.close();
	}

}
