package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자: ");
			int num = sc.nextInt();

			if(num > 0) {								// if 안에 또 if를 또 쓸수있다. 
					if(num % 2 ==0) {					// 그림을 잘그리고 의도를 파악해야한다.
					System.out.println("짝수");
				} else {
					System.out.println("홀수");
				}
			} else if(num < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0입니다.");
			}
			
			
			
			/*
			if(num % 2 == 0 && num > 0) {              //내가 풀은 코딩
				System.out.println("짝수");
			} else if(num % 2 == 1) {         //num>0 && num%2 != 0 도 쓸수있음.
				System.out.println("홀수");
			} else if(num < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0입니다.");
			}
			 */
			
			//	} else if(num == 0) {
			//		System.out.println("0입니다");
			//	}
			
			
			sc.close();
			
	}
	
}