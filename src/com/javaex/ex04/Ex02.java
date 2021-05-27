package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;  //초기화      어려운문제가 나와도 ppt그림을 잘보고 이해해야함
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		
		
		while (i<10) {   //반복조건
			System.out.println(dan + " * " + i + " = " + dan*i);
			
			//증감식
			i++;
		}
		
		
		sc.close();
	}

}
