package javaBasic.ch01.sec15;

public class DateTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //자료형 - 기본형( 정수형, 실수형, 논리형, 문자형)
		// 교재 39쪽
		//정수처리
		byte b1 = 127;  //-128 ~ +127 까지 가능
		System.out.println(b1);
		
		
		short s1 = 32767;  //-32768  ~ 32767 까자ㅣ 가능
		long	lo1 = 9000000000000000000l;
		
		byte b2 = 10;
		byte b3 = 20;
		
		int b23 = b2 + b3;  //+ 연산자 int형으로 처리함. byte형 int형 byte형
		
		short s2 = -20;
		short s3 = +20;
		
		int resul23 = s2 -s3; //-40
		
		byte b4 = 20;
		short s4 = 30;
		
		long sumb4s4 = b4 + s4;
		
		float f1 = 3.14f;
		float f2 = 3.12345678f;  // 소수점 자라ㅣ 7자리이내로 표기가능
		
		System.out.println(f1+" "+f2);
	
		double d1 = 3.1234567890123456;  //15자리까지 표기 가능
		System.out.println(d1);
		
		// 실수형은 float - 4byte 와 double형 - byte
		
		float f3=10.23f;
		float f4=2.45f;
		float mulf3f4 = f3*f4;
		System.out.println(mulf3f4);
	
		
		double mulf3f4d = f3*f4;
		System.out.println(mulf3f4d);
		
		
		double d3=3.14;
		double d4= 12.65;
		
		double muld3d4 = d3*d4;
		System.out.println(muld3d4);
		
		//float muld3d4f = d3 * d4; 에러발생 왜 작은 타입으로 넣어줘서.
		
		
		double resulf3f4 = f3 /f4; // float 자료형이 double 형으로 변환됨 - 형변환 cast연산 자동형변환
		
		int ii1=10;
		short ss1=20;
		
		float ff1=ii1; //실수형 = 정수형 형 변환 cast 연산 자동형 변환
		
		// 실수형 > 정수형 30평 아파트 > 8평 원룸 가구버려야함. 데이터 손실
		// 형변환 = 강제 형변환 = down cast 연산 큰 타입 > 작은타입으로 바뀜
		// 형식, 정수형 타입, 변수명 = (정수형 타입) 실수형 변수
		
		double d10 = 3.14;
		int chang10 =(int) d10;  // 소수점 .14를 손실했다.
		System.out.println(d10+" "+chang10);
		
		float f10 = 10.25f;
		byte changef10 = (byte) f10;
				
		int i10 =3000;
		short chi10 = (short)i10;
		
		
		// 문제) 정수형으로 국어점수 수학점수 영어점수 변수 담으세요.
		
		int kor=80;
		int mat=90;
		int eng=83;
		
		//합계구하기
		
		int sum = kor+mat+eng;  //long 왜 안되는지 궁금함
		
		//평균 구하기
		double avg = sum/3.0;  //253 / 3을 연산하면  정수 /정수 이므로 정수만 나온다. 
		double avg1 = (double)sum /3;
		
        // 수학 점수의 거듭제곱 90**2
		
		int matdoub = mat*mat;
		
		//출력하기
		System.out.println("합계는 "+sum);
		System.out.println("평균은 "+avg);
		System.out.println("평균은 "+avg1);
		System.out.println("수학의 거듭제곱은 "+matdoub);
		
		
		char ch1 = 'a';
		System.out.println((int) ch1);
		
		System.out.printf("%c", ch1+3);  // "%c"는 문자형으로 표기 해달라는 기호, "f"는 formet의약자
		
		System.out.printf("%c%c%c%c%c", 75, 111,114, 101, 97);
		
		
		
		
		
	
		
				
		
	}

}
