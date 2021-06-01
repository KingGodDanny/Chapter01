package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		//배열 같음 판단
		int[] arrA = new int[3];
		arrA[0] = 50;
		arrA[1] = 20;
		arrA[2] = 70;
		
		int[] arrB = new int[3];
		arrB[0] = 10;
		arrB[1] = 70;
		arrB[2] = 30;
		
				
		//배열A    배열B 같은지 판단--> 배열의 개수 같아야한다. 값과 순서가 같아야한다.
		
		if(arrA.length==arrB.length) { //배열의 갯수가 같다.
			//두개가 같으니깐 비교를 시작! (그게 아니면 종료. 굳이 else쓸필요 없음)
				
			for(int i=0; i<arrA.length; i++) {
			
			
				if(arrA[i] != arrB[i]) {
				
					System.out.println(i + " 번째 값이 다릅니다");
			
				}
			} 
			
				
		}  else {  //배열의 크기다 다르다면!
			System.out.println("배열의 크기가 다릅니다!");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
