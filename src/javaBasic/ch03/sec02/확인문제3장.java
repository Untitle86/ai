package javaBasic.ch03.sec02;

public class Ȯ�ι���3�� {

	public static void main(String[] args) {
		// ���� 107��
		int x=10;
		int y=20;
		int z =(++x)+(y--);
		System.out.println(z);
		
		
		int score =85;
		String result =(!(score>90))?"��":"��";
		System.out.println(result);
		
		//3
		  int pencils =102;
		  int students =10;
		  
		  //�л� �� ���� ������ ���� ��
		  int pencilsPerStudent =(pencils/students);
		  System.out.println(pencilsPerStudent);
		  
		  //���� ���� ��
		  int pencilsLeft = pencils % students;
		  System.out.println(pencilsLeft);
		
		//4 
		  int value = 356;
		  double r1 = value/100.0;
		  System.out.println(r1); //3.56
		  
		  int r2 = (int) r1;
		  System.out.println(r2); //3
		  
		  int r3 = r2*100;
		  System.out.println(r3);
		  
		  System.out.println((int)(value*0.01) *100);
		  
		  //5
		  int lengthtop =5;
		  int lengtBottom = 10;
		  int height =7;
		  double area =(double)((lengthtop+lengtBottom)*height/2);
		  System.out.println(area);
 
	}
	

}
