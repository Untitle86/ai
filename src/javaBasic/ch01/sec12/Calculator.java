package javaBasic.ch01.sec12;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x = 1;                  //변수 x를 선언하고 1을 저장
        int y = 2;                  //변수 y를 선언하고 2를 저장
        int result = x + y;         //변수 result를 선언하고 x와 y를 더한 값을 저장
        System.out.println(result); //콘솔에 출력한느 메소드 호출
	
        String name;
 	   name="홍길동"; //이름
 	   
 	   int basicpay=50000; //급여
 	   String phoneNumber = "010-123-1234"; //전화번호
 	   String accountNumber = "국민 123-12-1234"; //계좌번호
 	   String dept = "알바생"; //직급
 	   boolean sex = true; //성별 남자
 	   double tex =0.03; //세금 비율
 	   
 	   //출력하기
 	   System.out.println("1번 알바 정보 :"+ name +" " + basicpay + " " + phoneNumber );
 	   System.out.println(accountNumber + " " + dept + " " + sex + " " + tex);
 	   
 	 String name2;
	   name2="이순신"; //이름
	   
	   int basicpay2=20000; //급여
	   String phoneNumber2 = "010-234-4567"; //전화번호
	   String accountNumber2 = "우리 321-32-4321"; //계좌번호
	   String dept2 = "정직원"; //직급
	  boolean sex2 = true; //성별 남자
	  double tex2 = 0.02; //세금 비율
	  
	  //출력하기
	  System.out.println("2번 알바 정보 :" + name2 + " " + basicpay2 + " " + phoneNumber2 );
	  System.out.println(accountNumber2 + " " + dept2 + " " + sex2 + " "+ tex2);
	  
	   String name3;
 	   name3="이경미"; //이름
 	   
 	   int basicpay3=15000; //급여
 	   String phoneNumber3 = "010-987-7456"; //전화번호
 	   String accountNumber3 = "신한 123-555-7878"; //계좌번호
 	   String dept3 = "팀장"; //직급
 	  boolean sex3 = false; //성별 여자
 	  double tex3 = 0.0015; //세금 비율
 	  
 	  //출력하기
 	  System.out.println("3번 알바 정보 :" + name3 + " " + basicpay3 + " " + phoneNumber3 );
 	  System.out.println(accountNumber3 + " " + dept3 + " " + sex3 + " "+ tex3);
 	  
 	  //실지급액
 	  //1번 10시간 2번 15시간 3번 20시간 4번 25시간 5번 30시간
 	  //1번 10시간 일해서 10 x 50000 = 500000 세금 500000 x 0.03 실수령액 = 500000 - 세금
 	  
 	  int sum1 = 10 * basicpay;
 	  // 50만원을 변수로 선언
 	  
 	  // int texcal = sum1 * tex;   // 5000000*0.03  error
 	  double texcal = sum1 * tex;
 	  //세금을 계산한다.
 	  
 	  double salary = sum1 - texcal;  //정수형 - 실수형
 	  //실수령을 계산한다.
 	  
 	  System.out.println(sum1 + " " + texcal +" " + salary );
 	 
 	  
	}

}
