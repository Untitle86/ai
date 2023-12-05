package javaBasic.ch03.sec02;

import java.util.Scanner;

public class 산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); // 키보드로 글자 입력하는 클래스
        
        // 이름은?
        // 국어점수는?
        // 영어점수는?
        // 수학점수는?
        
        //출력
        //홍길동 100 80 90
        
        System.out.print("이름은?");
        String name = sc.next();
        System.out.println();  // 줄바꿈
        
        System.out.println("국어점수는?");
        int kor = sc.nextInt();
        System.out.println();
        
        System.out.println("영어점수는?");
        int eng = sc.nextInt();
        System.out.println();
        
        System.out.println("수학점수는?");
        int mat = sc.nextInt();
        System.out.println();
        
        System.out.println(name+" "+kor+" "+eng+" "+mat);
        
        //합계 구하기
        int sum = kor+eng+mat;
        
        //합계 - 국어점수
        
        int sumtotal = sum -kor;
        
        
        //평균 = 합계 / 3
        double avg = sum /3.0;
        
        //수학점수가 홀수입니까, 짝수입니까?  2의 배수이면 짝수, 아니면 홀수
        // "%" 나머지를 구하는 함수
        
        int matmod = mat%2;
        System.out.println(sum+" "+sumtotal+" "+avg+" "+matmod);
   
        
//        int kor = sc.nextInt();
//        
//        System.out.println(kor);
//        
//        double rate = sc.nextDouble();
//        System.out.println(rate);
//        
//        // true 입력 출력
//        
//       boolean OX = sc.nextBoolean();
//       System.out.println(OX);
//       
//       //홍길동 이라고 이름을 입력하고 출력하기
//       
//       String name =sc.next();
//       System.out.println(name);

	}

}
