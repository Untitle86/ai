package javaBasic.ch04.sec01;

import java.util.Scanner;

public class Switch문 {

	public static void main(String[] args) {
		// 영어 단어 공부 프로그램
		// 'A' 라고 입력하면 Apple이라고 출력
		// 'B' 라고 입력하면 Bear라고 출력
		// 'c' 라고 입력하면 Cat이라고 출력하기
		
		//키보드입력하기
		Scanner sc = new Scanner(System.in);
				System.out.print("영어 첫 글자 입력하기(A~C)");
		String word = sc.next();
		System.out.println(word);
		
  //조건문
		if(word=="A")
		{System.out.println("Apple");}else if(word.equals("B")) {
		System.out.println("Bear");}else if(word.equals("C")) {
			System.out.println("Cat");}else {System.out.println("입력하신 글자는 A,B,C가 아닙니다.");
		}
		
		
		//Swtich문
		
		switch(word) {
		case "A" : System.out.println("Apple");
		case "B" : System.out.println("Bear");
		case "C" : System.out.println("Cat");
		default : System.out.println("입력하신 글자는 A,B,C가 아닙니다.");
		
		}
		
		// number=100이면 "백의자리" 10이면 "십의자리" 1이면 "일의자리"
int number = 100;
switch	(number) {
case 100 : System.out.println("백의자리"); ;break;
case 10 : System.out.println("십의자리");;break;
case 1 : System.out.println("일의자리");;break;}


	// 반복문
	//형식 while(조건) {참이면 수행할 문장}
	//1~100 출력하기

int number = 100;
System.out.println(number);
	
}
	
	}

}
