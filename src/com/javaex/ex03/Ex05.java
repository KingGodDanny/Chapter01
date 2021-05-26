package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int hour = sc.nextInt();
		
		if(hour > 8) {
			int pay = 8 * 10000 + (hour-8) * (int)(10000*1.5);   //실수를 정수로 강제형변환을 위해 출제된 문제
			System.out.println("임금은 " + pay + "원 입니다.");
		} else {
			int pay = hour * 10000;
			System.out.println("임금은 " + pay + "원 입니다.");
		}
		
		/*
		if(hour<=8) {
			int pay01 = hour * 10000;
			System.out.println("임금은 " + pay01 + "원 입니다.");
		} else {
			int pay02 = hour * 10000 + (hour-8) * 5000;		
			System.out.println("임금은" + pay02 + "원 입니다.");
		}
		*/
				
		sc.close();

	}

}
