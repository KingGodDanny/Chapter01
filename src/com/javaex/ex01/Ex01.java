package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
//		byte형 예제
		/*
		byte myAge;						 //바이트는 최대 -128~127까지 표현하지만 요즘은 
		myAge = 25;						// 용량이 커졌기때문에 바이트값으로 잘표현하지않는다.
		System.out.println(myAge);       
		*/
		
		/*int myAge;
		myAge = 124561;
		System.out.println(myAge);
		//		#### int 범위안에 벗어나는 숫자는 long이고 숫자뒤에 L을 붙여줘야한다 #### */
		
		
		/* 
		//변수 생성과 값 입력되는 순서 비교
		int age;
		int weight;
		int tall;
		
		//int age = 25;   이건 age를 잡고 바로 age에 25를 넣어라는 뜻 ,그럼 넣을수잇는 값이 제한됌
		
		age = 30;
		weight = 80;
		tall = 73;
		*/
		
		/*
		//변수 생성과 값 입력되는 순서 비교
		int age;
		int weight;
		int tall;
		
		weight = 80;
		tall = 73;
		age = 30;
		*/
		
		
		/*int age; //나이
		age = 25;
		
		int age=25;
		*/
		
		
		//변수가 여러개일때 표현방법 -1 ///////////////////
		/*
		int var01;
		int var02;
		int var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		*/
		
		//변수가 여러개일때 표현방법 -2 ///////////////////
		
		/*int var01 = 10;
		 * int var02 = 20;
		 * itn var03 = 30;
		 */
		
		//변수가 여러개일때 표현방법 -3 ///////////////////
		/*
		int var01 , var02, var03;
		
		var01 = 10;
		var02 = 20;
		var03 = 30;
		*/
		
		//변수가 여러개일때 표현방법 -4///////////////////
		int var01 = 10, var02 = 20, var03 = 30;
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
	}
}
