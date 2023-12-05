package javaBasic.ch03.sec02;

public class operator01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number=10;
       // number =number+1;               //많이 쓰는 수식
        number++;                         //간편 수식 상위 수식과 동일한 효과
        ++number;
        System.out.println(number);  
        
        number = number -1;
        number--;
        --number;
        System.out.println(number);
        
        
        
        int number1 = 100;
        number = number+1;
        		System.out.println(number1);
        		
        int number2 =1000;
        number++;
        int number3 = number2;
        
        System.out.println(number2);
        System.out.println(number3);
        		
        
        int number4 = 20;
        int number5 =number4++;
        System.out.println(number4);  //21
        System.out.println(number5);  //20
        
        
        int number6 =200;
        int number7 =++number6;
        System.out.println(number6); //201
        System.out.println(number7);  //201   // 더하기가 숫자 앞에 있으면 덧셈을 먼저하고 뒤에 있으면 연산을 후에 하는 방식임.
        
        
        int number8 = 2000;
        System.out.println(number8++);
        System.out.println(number8);
        
        
        int number9 = 2000;
        System.out.println(++number9);
        System.out.println(number9);
        
	}

}
