package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		
		//!!!!!!!!!이름하고 나이의 순서가 바뀔땐 꼭 사이에 sc.nextline(); 을 넣어주기!!!!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		
		System.out.println("키를 입력해주세요.");
		System.out.print("키 : ");
		double tall = sc.nextDouble();
		//double tall = sc.nextfloat();  더블이 플롯보다 크기때문에 오류나지않는다.
		//float tall = sc.nextDouble();  플롯이 더블보다 작기때문에 오류가 난다.  앞뒤를 맞춰주는것이 중요하다.
		
		System.out.println("당신의 이름은 \"" + name + "\" 나이는 " + age + " 키는 " + tall + " 입니다.");
		
		sc.close();

	}

}
