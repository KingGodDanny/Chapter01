package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		
		intArray[0] = 11;
		intArray[1] = 3;
		//intArray[2] = 78;    //초기화(값을 넣지않은경우 정수형-->0으로 표기된다.
							   //실수형, boolean, char 기본값 알아볼것
		
		System.out.println("======================");
		System.out.println(intArray.length);
		System.out.println("======================");
		
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("======================");
		
		//java.lang.ArrayIndexOutOfBoundsException 는 없는 방을 출력하려고해서 뜨는것임.
		for(int i=0; i<=intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
