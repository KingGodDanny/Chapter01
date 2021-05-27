package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		for(int y=1; y<=6; y++) {
			for(int x=1; x<=y; x++) {
				
			System.out.print("*");
			}
			
			System.out.println("");  
			
		}

	}

}


//y축이 1칸 시작할때 x축에 *한개 y축이 2칸할때 x축에 *두개의 패턴이기때문에
//첫 for에 1이 들어가면 true 되고 그럼 그다음 for에 x는 y가 1이니깐 1
//그래서 첫줄째 *하나
//두번째는 