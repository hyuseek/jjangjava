package org.jjang.day02.practice;

import java.util.Scanner;

public class practice4 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println("짝수다");
		} else if (num %2 != 0) {
			System.out.println("홀수다");
		};
	}
}
