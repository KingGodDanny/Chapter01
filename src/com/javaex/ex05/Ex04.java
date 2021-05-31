package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		//방갯수 변경할때 for문에서 개수 부분을 변경해줘야함
		
		int[] num = new int[8];      // 뒤에 []는 방의갯수
		
		
		for(int i = 0; i<8; i++) {
			num[i] = ((int)(Math.random()*45)+1);
		}   // new int[6] 의 방갯수가 8개로 바뀔경우 수동적으로 바꿔주는상황이 대부분임
			//num[i] = ((int)(Math.random()*45)+1); 처럼 한줄로 적을수있는경우는 거의없음
		
		System.out.println(num.length);
		System.out.println("============================");
		
		for(int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
		}   
		
		System.out.println("=============================");
		

		for(int i=0; i<num.length; i++) { 
			
			System.out.println(num[i]);
		}

		
		
		
	}

}
