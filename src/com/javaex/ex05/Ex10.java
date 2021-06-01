package com.javaex.ex05;
// cmd에서 javaC Ex10.java --> class가 맹글어짐
// java Ex10

//java -version 처럼 뭔가 값을 줘야할때가 잇음  (버전 부분!)
public class Ex10 {

	public static void main(String[] args) {
		
		System.out.println("==========char====================");
		
		char[] arrC = new char[3];
		arrC[0] = '정';
		arrC[1] = '이';
		arrC[2] = '유';
		
		for(int i=0; i<arrC.length; i++) {
			System.out.println(arrC[i]);
		}
		
		
		System.out.println("===========String=====================");
		
		String[] arrS = new String[3];
		arrS[0] = "정우성";
		arrS[1] = "이효리";
		arrS[2] = "유재석";
		
		for(int i=0; i<arrS.length; i++) {
			System.out.println(arrS[i]);
		}

		
		
	}

}
