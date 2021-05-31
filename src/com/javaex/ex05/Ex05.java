package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		//세부문법
		
		/*
		int[] intArray = new int[3];
		
		intArray[0] = 11;
		intArray[1] = 3;
		intArray[2] = 78;
		
		}
		*/

		int[] intArray = new int[] {11, 3, 78};
		
		//int[] intArray = {11, 3, 78};  //추천하지 않음  익숙해지면 사용하는것을 추천함.
 		
		
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
