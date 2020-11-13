package com.javaex.practice;

import java.util.Scanner;

public class Ex12_1 {

	public static void main(String[] args) {
		
		float num1,num2;
		String cal ;
		float result= 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		cal = sc.next();
		System.out.print("숫자1: ");
		num1 = sc.nextFloat();
		System.out.print("숫자2: ");
		num2 = sc.nextFloat();
		
		if(cal.equals("+")) {
			result = num1+num2;
			System.out.println("결과는: "+result);
		}else if(cal.equals("-")) {
			result = num1-num2;
			System.out.println("결과는: "+result);
		}else if(cal.equals("*")) {
			result = num1 * num2;
			System.out.println("결과는: "+result);
		}else if(cal.equals("/")) {
			result = num1/num2;
			System.out.println("결과는: "+result);
		}else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
	}

}
