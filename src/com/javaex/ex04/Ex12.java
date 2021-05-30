package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요 [0이면종료]");
		num = sc.nextInt();
		sum = sum + num;
		System.out.println("합계: " + sum);
		
		//반복시작
		while(num !=0 ) {
			num = sc.nextInt();
			sum= sum + num;
			System.out.println("합계:" + sum);
		}
		//반복끝
		
		System.out.println("종료");

		
		sc.close();
		*/
		
		/*/방법2 do while
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		
		do {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계:" + sum);

		}while (num !=0);
		
		System.out.println("종료");
		
		sc.close();
		*/
		
		// 방법3 while
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		
		while (true) {
			num = sc.nextInt();
			sum = sum + num;
			System.out.println("합계: " + sum);
			
			if(num == 0) {
				break;
			}
		}
		System.out.println("종료");
		
		sc.close();
	}

}
