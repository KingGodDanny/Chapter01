package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int hour = sc.nextInt();
		
		int pay01 = hour * 10000;
		int pay02 = hour * 10000 + (hour-8) * 5000;		
		if(hour<=8) {
			System.out.println("임금은 " + pay01 + "원 입니다.");
		} else {
			System.out.println("임금은" + pay02 + "원 입니다.");
		}
		
				
		sc.close();

	}

}
