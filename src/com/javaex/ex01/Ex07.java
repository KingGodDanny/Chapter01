package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {

		double v01 = 5/4;            // 5 와 4는 인트값인데 1.25로 알겠지만 소수점이 날라가서 1이되고
		System.out.println(v01);	// 답은 더블형이기때문에 뒤에 .0이 붙어서 1.0이된다
									// =  1.0   자동형변환

        
		double v02 = (double)5 / 4 ;  	//1.25 강제적 형변환이지만 실수를 실수로 바꾸기때문에 1.25이나온다.
		System.out.println(v02);   		// = 1.25  실수가 정수보다 더강력하다 ∴ 5.0 / 4.0이다.

        
        double v03 = 5 / (double)4 ;    //5와 더블4는 5 나누기 4.0이고 더블형이기때문에
        System.out.println(v03);      	// = 1.25	∴5.0 / 4.0

        
        double v04 = (double)5 / (double)4 ;  //더블형 5.0과 4.0의 나누기는 1.25고 더블형이기때문에
        System.out.println(v04);               // =  1.25

        
        int v05 = (int)1.3 + (int)1.8 ;    //1.3과 1.8의 인트는 1과 1이기때문에 1+1
        System.out.println(v05);       		//  = 2
        
        
        int v06 = (int)(1.3+1.8);			// 위문제처럼 의문이 생길경우엔 3으로 나오게하려면 
        System.out.println(v06);			// 이렇게 해야함
        
        
        /*My test
         * 
        int v07 = (double)1.3 + (double)1.8 ;  //에러나는 이유는 더블인 실수가
        System.out.println(v07);			   //정수인 인트보다 강하기때문에 표현되지않음.		
        
        */
        
	}

}
