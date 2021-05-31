package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
				
		
		int[] num = new int[6];      // 뒤에 []는 0부터의 갯수
		
				
		/*
		num[0] = ((int)(Math.random()*45)+1);
		num[1] = ((int)(Math.random()*45)+1);
		num[2] = ((int)(Math.random()*45)+1);
		num[3] = ((int)(Math.random()*45)+1);
		num[4] = ((int)(Math.random()*45)+1);
		num[5] = ((int)(Math.random()*45)+1);
		*/
		
		for(int i = 0; i<6; i++) {
			num[i] = ((int)(Math.random()*45)+1);
		}
		//일정한 규칙이 있기때문에 줄여쓸수 있지만 보통은 배열의 속성값이 전부 다다르다.
		
		/*
		System.out.println(no[0]);
		System.out.println(no[1]);
		System.out.println(no[2]);
		System.out.println(no[3]);
		System.out.println(no[4]);
		System.out.println(no[5]);
		*/
		
//		for(int i=0; i<num.length; i++)
		for(int i=0; i<6; i++) {
			
			System.out.println(num[i]);
		}
		
		

	}

}
