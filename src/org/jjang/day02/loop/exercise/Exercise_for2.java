package org.jjang.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_for2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 사이의 정수를 입력하세요: ");
		int num = sc.nextInt();
		if (num>=1 && num <=9) {
			for (int i=1; i<10; i++) {
					System.out.println(num+"*"+i+"="+num*i);
			}
		} else {
			System.out.println("1~9 사이의 정수만 입력해야합니다");
		}
	}
}
