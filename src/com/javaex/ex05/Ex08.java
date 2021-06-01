package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
			
		System.out.println("=========================");
		
		int[] arrB = new int[3];        // int[] arrB = arrA; 비교
		
		//값 복사
		for(int i=0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		//arrA출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		System.out.println("----------------");
		//arrB출력
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("========A[1]을 변경했을경우=================");
		//arrA[1]의 값만 바꿧을때 arrA[1]의 값만 바뀜
		//arrA 출력
		arrA[1] = 100;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		
		/*
		 
		 */
		
		
		
		System.out.println("===========B[1]가 변경되지않는이유==============");
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrB[i]);
		}
		
		
	}

}

/*
 B = A에 대입한다고 했고 그래서 new A의 주소지 x555와 B의 주소지 x666에 각각 3개의 방이 생겼는데
 A주소지의 [1]번째를 100으로 변경하였으니 B[1]값도 바꾸고싶다면 따로 변경을 해줘야할것이다.
 
 Ex08은 arrB에 new를주고 방의갯수를 줬기때문에 힙영역에 새로운 주소로 도장이 찍혔기때문에
 arrB = arrA로 했을때 B의 주소로 A의 값들이 복사된것이다
 
 Ex07과의 차이점을 잘 기억해야함!!!!ㅋ
 */
