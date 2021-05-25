package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);               //숫자 입력받고 문자열을 받으면 생기는 오류상황입니다.
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		int age = sc.nextInt();    // 30
		
		sc.nextLine();           // 나이를 누르고 엔터를 치면 이름값에 엔터가 입력이 되는 오류때문에 넣어주는것
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		
		System.out.println("당신의 이름은 \"" + name + "\" 나이는 \"" + age + "\" 입니다.");
		//System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		//                    당신의 이름은 대니 나이는 30 입니다. 로 나오는 답.
		
		sc.close();
		
	}

}
