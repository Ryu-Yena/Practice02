package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int num1,num2,num3;
		int mid;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		num1 = sc.nextInt();
		System.out.print("숫자2: ");
		num2 = sc.nextInt();
		System.out.print("숫자3: ");
		num3 = sc.nextInt();
		
		if(num1>num2) {
			mid = num2;
		}else mid = num1;
		
		if(mid<num3) {
			System.out.println("가장 작은 수는 "+mid+"입니다.");
		}else System.out.println("가장 작은 수는 "+num3+"입니다.");
		
		sc.close();
	}

}
