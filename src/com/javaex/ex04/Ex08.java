package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		int num = 1;
		
		while (true) {
			
			if(num%3==0 && num%14==0) {
				
				System.out.println(num);
				break;
			}
			num++;
			
		}	
	}
			
		
}

//while과  num++ 사이에 {}가 있어야한다.
//while문은 숫자가 정해져있지않을때 쓴다.
