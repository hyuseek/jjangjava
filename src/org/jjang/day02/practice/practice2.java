package org.jjang.day02.practice;

import java.util.Scanner;

public class practice2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println("양수다");
		} else if (num < 0) {
			System.out.println("음수다");
		} else if (num == 0) {
			System.out.println("0이다");
		};
	}
}

