package javaBasic.ch03.sec02;

import java.util.Scanner;

public class ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in); // Ű����� ���� �Է��ϴ� Ŭ����
        
        // �̸���?
        // ����������?
        // ����������?
        // ����������?
        
        //���
        //ȫ�浿 100 80 90
        
        System.out.print("�̸���?");
        String name = sc.next();
        System.out.println();  // �ٹٲ�
        
        System.out.println("����������?");
        int kor = sc.nextInt();
        System.out.println();
        
        System.out.println("����������?");
        int eng = sc.nextInt();
        System.out.println();
        
        System.out.println("����������?");
        int mat = sc.nextInt();
        System.out.println();
        
        System.out.println(name+" "+kor+" "+eng+" "+mat);
        
        //�հ� ���ϱ�
        int sum = kor+eng+mat;
        
        //�հ� - ��������
        
        int sumtotal = sum -kor;
        
        
        //��� = �հ� / 3
        double avg = sum /3.0;
        
        //���������� Ȧ���Դϱ�, ¦���Դϱ�?  2�� ����̸� ¦��, �ƴϸ� Ȧ��
        // "%" �������� ���ϴ� �Լ�
        
        int matmod = mat%2;
        System.out.println(sum+" "+sumtotal+" "+avg+" "+matmod);
   
        
//        int kor = sc.nextInt();
//        
//        System.out.println(kor);
//        
//        double rate = sc.nextDouble();
//        System.out.println(rate);
//        
//        // true �Է� ���
//        
//       boolean OX = sc.nextBoolean();
//       System.out.println(OX);
//       
//       //ȫ�浿 �̶�� �̸��� �Է��ϰ� ����ϱ�
//       
//       String name =sc.next();
//       System.out.println(name);

	}

}
