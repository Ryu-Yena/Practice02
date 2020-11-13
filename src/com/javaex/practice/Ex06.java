package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int num1,num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.print("큰 수: "+num1+"\t작은 수: "+num2);
		}else if(num1<num2) {
			System.out.print("큰 수: "+num2+"\t작은 수: "+num1);
		}else System.out.println("두 수를 비교할 수 없습니다.");
		
		sc.close();
	}

}
