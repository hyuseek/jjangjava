package org.jjang.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while (num != -1) {
			sum+=num;
			System.out.print("정수를 입력하세요(종료는 -1): ");
			num = sc.nextInt();
		} System.out.println("합 출력: "+sum);
		
		//while(true) {
			//System.out.print("정수 출력: ");
			//int input = sc.nextInt();
			//if (input==-1) break;
			//sum = sum + input;
		//}
	}
}
