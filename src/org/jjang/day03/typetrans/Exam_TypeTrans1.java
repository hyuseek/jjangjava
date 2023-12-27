package org.jjang.day03.typetrans;

public class Exam_TypeTrans1 {
	public static void main(String [] args) {
		int iNum = 10;
		double dNum = 3.14;
		double result = dNum / iNum;
		System.out.println("result: "+result);
		// 자동형변환의 방향은 더 큰쪽으로 자동으로 변환
		
		System.out.println("result: "+(int)result);
		System.out.println("강제 형변환: "+(char)65);
	}
}
