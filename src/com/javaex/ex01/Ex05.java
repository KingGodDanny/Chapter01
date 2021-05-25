package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		//일반적인 방식
		
		double pi = 3.14;
		double result01 = 5 * 5 * pi;		
		System.out.println(result01);
		

		//PI는 항상 3.14로 사용해야한다. -->변경되었음.
		pi = 3.1415926;
		double result02 = 5 * 5 * pi;
		System.out.println(result02);
		
		
		//상수로 정의한 경우  상수란 :변수에 대하여 항상 일정한 값을 취하는 양
		//final을 쓸경우 변수를 대문자로해야함
		final double PI = 3.14;
		double result03 = 5 * 5 * PI;
		System.out.println(result03);
		
		
		double result04 = 5 * 5 * PI;
		System.out.println(result04);
		
		
		/*
		final double PI = 3.25;
		double result05 = 10 * 10 *PI;
		System.out.println(result05);
		
		한 클래스 안에서 final (상수)로 한번 지정되면
		다시 final을 줘서 변수의 값을 변경할수없다.
		*/
		
		
		/*
		// ****위에 파이널로 PI값이 지정된경우는 
		// ****아래처럼 PI 값처럼 변경할수없음.
		PI = 3.1415926;
		double result04 = 5 * 5 *PI;
		System.out.println(result04);
		*/
		
		
		
	}
}
