package org.jjang.day01.operator.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// 입력받은 문자가 대문자인지 소문자인지 확인하세요
		// 문자를 입력해주세요: a
		// 문자 출력 : a
		// 영어 대문자 확인 : false
		Scanner sc=new Scanner(System.in);
		System.out.print("문자를 입력해주세요: ");
		char moonja = sc.next().charAt(0);
		boolean result = ('A'<=moonja && 'Z'>=moonja);
		System.out.println((int)moonja);
		System.out.println("문자출력: "+moonja);
		System.out.println("영어 대문자 확인: "+result);
	}
}
