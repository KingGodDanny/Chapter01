package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		//int myAge=25;
		Scanner sc = new Scanner(System.in);  // sc에 스캐너라는 값을 넣어주는데 스캐너는 실제값이 안정해져있고 주소라는 값을 넣어주라는 뜻이다. 
											
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자:");
		int num = sc.nextInt();
		
			
		System.out.println("입력하신 숫자는 " + num + " 입니다." );	
		
		sc.close();    //  <쓰는 이유는 이제 입력된 정보를 다지우고 끝내라는 대충 그런뜻..
	}

}
