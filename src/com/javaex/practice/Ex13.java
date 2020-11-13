package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		float x,y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		System.out.print("숫자: ");
		x = sc.nextFloat();
		
		if(x<=0) {
			y = x*x*x-9*x+2;
			System.out.println("계산결과는 "+y+"입니다.");
		}else if(x>0) {
			y = 7*x+2;
			System.out.println("계산결과는 "+y+"입니다.");
		}
		
		sc.close();
	}

}
