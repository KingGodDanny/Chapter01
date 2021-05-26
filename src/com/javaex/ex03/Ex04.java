package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int hour = sc.nextInt();
		
		
		if(hour > 8) {
			int pay = 8 * 10000 + (hour-8) * 12000;  		
			System.out.println("임금은 " + pay + "원 입니다.");
		} else {
			int pay = hour * 10000;
			System.out.println("임금은 " + pay + "원 입니다.");
		}
		// if로 hour>8 true를 잡고 else를 주어도 무방하다.  더 좋은코드다.
		
		
		/*
		if(hour<=8) {
			int pay01 = hour * 10000;
			System.out.println("임금은 " + pay01 + "원 입니다.");
		} else {
			int pay02 = 8 * 10000 + (hour-8) * 12000;  		
			System.out.println("임금은 " + pay02 + "원 입니다.");
		}
		 */
		// int 변수를 한곳에 몰아놓고 if를 줄경우 두번의 쓸데없는 계산을 하기때문에 좋은 코드가아님.
		sc.close();

	}

}
