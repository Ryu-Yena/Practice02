package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		float num1,num2;
		String cal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		cal = sc.nextLine();
		System.out.print("숫자1: ");
		num1 = sc.nextFloat();
		System.out.print("숫자2: ");
		num2 = sc.nextFloat();
		
		switch(cal) {
			case "+":
				System.out.println("결과는: "+(num1+num2));
				break;
			case "-":
				System.out.println("결과는: "+(num1-num2));
				break;
			case "*":
				System.out.println("결과는: "+(num1*num2));
				break;
			case "/":
				if(num2==0) {
					System.out.println("계산할 수 없습니다.");
				}else System.out.println("결과는: "+(num1/num2));
				break;
			default:
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		
		sc.close();
	}

}
