package com.javaex.ex02;

import java.util.Scanner;   // 컨트롤 쉬프트 o 하면 됌 ,, 많은 임포트를 한번에 쫙 나오게 할수있음.

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);    //시스템.인은 키보드로(?) 쓴다라는 뜻
		
		System.out.println("이름을 입력해주세요");
		System.out.print("이름:");
		
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		sc.close();

	}

}
