package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i<=10; i++ ) {
			sum = sum + i;
			System.out.println(i + "까지의 합은 " + sum);
		}
		
		System.out.println("10회 까지의 합은 " + sum);
	}

}
