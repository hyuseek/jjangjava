package org.jjang.day01.basic;

public class Exam_DataType {
	public static void main(String [] args) {
		// 기본형
		// 정수, 실수, 문자, 문자열, 논리형
		// 정수 4가지(byte, short, int, long)
		// 실수 2가지(float, double)
		// 문자 char
		// 논리형 boolean
		// 참조형
		// 문자열 String
		boolean result = true;
		char fChar = 'a';
		System.out.println(result);
		System.out.println(fChar);
		
		//실수 part
		float fNum = 23.026f;
		double dNum = 23.026;
		System.out.println(fNum);
		System.out.println(dNum);
		
		//정수 part
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147483647l;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
	}
}
