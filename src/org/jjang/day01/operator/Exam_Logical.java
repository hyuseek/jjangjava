package org.jjang.day01.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		// 논리연산자 예제
		// Oracle에서 WHERE절 뒤에 적었던 논리연산자 AND, OR과 같은 역할을 함
		// ex) 남자이면서 평균평점 4.3 이상인 사람
		//		컴퓨터공학과 또는 경영학과 사람
		boolean result1, result2, result3, result4;
		// boolean result2;
		// boolean result3;
		// boolean result4;
		int num1 = 50;
		int num2 = 30;
		
		//result1 = (num1==num2) && (num1<num2);
		//result2 = (num1<num2) || (num1==num2);
		//result3 = (num1>num2) && (num1!=num2);
		//result4 = (num1>num2) || (num1==num2);
		
		int a = 70;
		int b = 55;
		
		result1 = (a==b) || (a++ < 100);
		result2 = (a < b) && (--b < 55);
		result3 = (a != b) && (b-- < a++);
		result4 = (a++ != b) || (b++ >= 85);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(a);
		System.out.println(b);
		
		// a는 70, b는 55
		// result1 = (a==b) || (a++ < 100);
		// result2 = (a < b) && (--b < 55);
		// result3 = (a != b) && (b-- < a++);
		// result4 = (a++ != b) || (b++ >= 85);
		// a: 73, b: 54
		// result1: true, result2: false, result3: true, result4: true
	}
}
