package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {

		//논리 연산자
		
		int a = 5; 
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&&연산자 ==========================");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		
		//논리 연산자 기본 ||
		System.out.println("||연산자 ==========================");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		
		//논리 연산자 응용 
		System.out.println("논리연산자 응용=======================");
		System.out.println((a>b)&&(a<b));     //  (5>7) -->false  (5<7) -->true 이고 그렇다면 false && true--> false이다.
		System.out.println((a>b)&&(a>b));     //  (5>7) --false   (5>7) --false  이고 그렇다면 false && false --> false이다.
		System.out.println((a>b)||(a<b));     //  (5>7) --false   5<7)  --true  이고 그렇다면 false || true --> true이다. 
		System.out.println((a>b)||(a<b)&&(a<b)); // (5>7) --false  || (5<7) -- true  그러면 true && (5<7) -- true    따라서 true
		System.out.println((a>b)&&(a<b)||(a<b)); // (5>7) --false && (5<7) -- true  그러면 false || (5<7) -- true    따라서 true
		
		System.out.println((a>b)&&(a<b)&&(a<b));   // (5>7) --false && (5<7) --true 그러면 false && (5<7) -- true  따라서 false     false && (5<7) --> 계산해버리지 않는다. 어차피 &&false는 false기 때문에
		
		
		
		System.out.println("논리연산자 ! ========================");
		System.out.println((a<b));    // 5<7  -- > true
		System.out.println(!(a<b));   // 5<7  -- > true      !true --> false
		System.out.println(  (a>b)&&(a>b)  );   //   (5>7) --> false && (5>7) --> false  따라서 false
		System.out.println(!(   (a>b)&&(a>b)    ));      //   (5>7) --> false  && (5>7) --> false  --> !(false) 따라서 true가 된다
		
		System.out.println(  (a>b)&&!(a>b)  );           //   (5>7)--> false && !(5>7) --> !(false)   따라서 false
		System.out.println(  !(a>b)&&!(a>b)  ); 		 //   !(5>7) --> true && !(5>7) --> true      따라서 true
		
		
		
	}

}
