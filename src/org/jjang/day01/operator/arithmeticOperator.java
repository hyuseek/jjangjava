package org.jjang.day01.operator;

import java.util.Scanner;

public class arithmeticOperator {
	// 초단위의 정수를 입력받고, 몇시간, 몇분, 몇초인지 출력하는
	// 프로그램을 작성하여라
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		// 정수를 입력하세요: 5000
		// 5000초는 1시간, 23분, 20초입니다.
		System.out.print("정수를 입력하세요: ");
		int time = sc.nextInt();
		int hour = time / 60 / 60;
		int minute = time / 60 % 60;
		int second = time % 60;
		System.out.println(hour+"시간"+minute+"분"+ second +"초");
	}
}
