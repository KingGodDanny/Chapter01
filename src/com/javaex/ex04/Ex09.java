package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println("종료");
				break;
				
			} else if(num%3==0) {
				
				System.out.println("3의 배수입니다.");
				
			} else {
				System.out.println("3의 배수가 아닙니다.");
				
			}
		}
					
		sc.close();
				
	}

}

//num++은 숫자를 입력받기 때문에 쓰지않아도된다.
//몇번째일지 모르기때문에 while 을 써줬고
// 1을 넣엇을때부터 첫줄 아니기때문에 둘째줄로 가고 그것도아니기때문에
//3번째줄가서 맞지만 break가 없기때문에 다시 올라간다.
//0 나누기 3은 0이기때문에 num%3==0이 맨위의 if로 들어가면 성립되서
//break에 걸려버린다.
//내생각엔 break의 위치가 종료되는 시점이 정해져있는곳에 써주는것이 좋은것같다.
