package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {

		//대입연산자
		System.out.println("대입연산자---------------");
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		//산술연산자
		System.out.println("산술연산자---------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b);		//어떤값을 주지않을시엔 int값으로 표현된다. 몫
		System.out.println(a%b);		//                                나머지
		
		
		//산술연산자 %
		System.out.println("산술연산자  / & 자세히");
		System.out.println(7.0 / 2.0);
		System.out.println(7.0 % 5.0);
		
		//부호연산잔
		System.out.println("부호연산자 -------------");
		int Var = -3;
		int pVar = +Var;
		int mVar = -Var;
		Var = -Var;
		System.out.println(Var);
		System.out.println(pVar);
		System.out.println(mVar);
		System.out.println(Var);
		
		
		//증감연산자 
		//+,-가 변수앞에 붙으면 연산이 우선순위가 되고  (++a --b) 
		//변수뒤에 붙으면 오리지널의 값을 먼저 출력하고 연산을 나중에 하라는 뜻이다. (a++ b--)
		System.out.println("증감연산자 front----------------");
		System.out.println(a);           ////a = 7
		System.out.println(++a);   	   // 변수앞에 ++가 들어가면 본인 자신을 바꿔서 그다음출력부터는 바뀐값으로 나온다
		System.out.println(a);        //a의 값은 변했을까?  -->변한다
		
		
		
		System.out.println(b);			////b = 2
		System.out.println(--b);		// 변수앞에 ++가 들어가면 본인 자신을 바꿔서 그다음출력부터는 바뀐값으로 나온다
		System.out.println(b);			//b의 값은 변할까?  -->변한다
		
		System.out.println("증감연산자 back----------------");
		
		System.out.println(a);      //a ->>>> 8
		System.out.println(a++);   //출력부터하고 ++를 나중에 한다  그래서 ----> 8
		System.out.println(a);
		
		System.out.println(b); 		//b ->>>> 1
		System.out.println(b--);	//출력부터하고 --를 나중에 한다 그래서 ----> 1
		System.out.println(b);
		
		
		System.out.println("증감연산자 연습문제---------------");
		
		int num = 5;
		System.out.println(num);     //  num ---> 5
		
//		System.out.println(++num);   // num을 5에서 6으로 바꾸고  출력한다
		
//		System.out.println(num++);   // num 을 먼저 출력하고 그다음에 ++를 출력한다
//		System.out.println(num);     // 다시 출력했을때 5--->6이된다
		
		System.out.println(num++ *10 - 7);  //num X 10  --> -7 --->   출력  --> num++ 출력
		System.out.println(num);
		System.out.println(num*10);
		
		
		System.out.println(++num *10 - 7); //위에서 num이 6이 되었고 이라인에선 ++가 앞에 왔기때문에
										   //num-->6 + 1이 되고 --> X 10 --> -7 한다음 출력한다
		
		System.out.println(num);		  //윗 라인에서 num 앞의 ++영향으로 7이되었기 때문에 현재 줄에선
										  // num은 --> 7이된다.
	}

}
