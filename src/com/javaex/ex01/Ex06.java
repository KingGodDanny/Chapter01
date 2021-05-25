package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {

		
		//자동형변환(암묵적 형변환) : 자동형변환 규칙을 알아야 자료형을 결정할수있다.
		System.out.println(2+3.5);
		
		double var = 2 + 3.5;
		float var01 = 2 + 3.5F;
		System.out.println(var);
		System.out.println(var01);
		
		
		//my test
		
		int num1 = 1;
		float num2 = 2.1F;
		double result = num1 + num2;
		System.out.println(result);
		
		
		int num3 = 1;
		float num4 = 2.1F;
		float result1 = num3 + num4;
		System.out.println(result1);
		
		//my test finish

		
		//자동형변환2 (long + float)
		long var02 = 12345L; //int값이 넘어가면 "L"을 붙여주지만 그냥붙여주기
		float var03 = 1.1F;
		System.out.println(var02+var03); //값은 float로 나온다.
		
		
		float result01 = var02 + var03; //long 값이 float로 변환
		System.out.println(result01);
		
		////////////////////////////////////////////////////////
		
		//강제형변환(명시적 형변환)
		int var04 = (int)3.14;  //3.14는 실수지만 강제로 정수로 바꿀때
		System.out.println(var04);
		
		//확대변환
		byte var05 = 10;
		int result02 = (int)var05;  //int result02를 byte할경우 바이트가 작기때문에 불가능
		System.out.println(result02);
		
		//축소변환
		int var06 = 10;
		byte result03 = (byte)var06;
		System.out.println(result03);
		
		//축소변환 비교 - 잘못된예시
		int var07 = 1030222;    
		byte result04 = (byte)var07;
		System.out.println(result04);
		
		//실수  -->> 정수  :   실수의 소수점이 사라진다
		double var08 = 5.57;
		int result05 = (int)var08;
		System.out.println(result05);
		
		//정수 -->> 실수  : 소수점 .0이 붙는다
		int var09 = 7;
		double result06 = (double)var09;
		System.out.println(result06);
		
		
		System.out.println("연습문제--------------------------");
		//2. f를 이용하여 i 출력값이 12.3이 되도록 해보자
		float f = 12.36256f;
		float G = f * 10;
		
		int A = (int)G;				//실수에서 정수로 변환이 불가능하기때문에
									//강제적으로 앞과 뒤에 int를 붙여줘서 변환한다.
		
		float i = A / 10f;	
		
		System.out.println(i);
		
		//메스플로우를 이용하여 12.3 만든 정답
		System.out.println(Math.floor(f*10)/10.0);
		
		//----------------------------------------------------
		
		System.out.println(Math.floor(f));
		
		//3. f의 소수점 둘째자리에서 반올림하여 12.4가 되도록 해보자
		System.out.println(Math.round(f*10)/10f);
		
			
	}

}
