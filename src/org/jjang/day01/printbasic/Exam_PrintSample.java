package org.jjang.day01.printbasic;

public class Exam_PrintSample {
	public static void main(String [] args) {
		System.out.println("개행");
		System.out.print("개행 x");
		
		// printf() 메소드
		int num = 11;
		double dNum = 1.11;
		System.out.printf("정수 출력: %d\n", num);
		System.out.printf("정수 출력: %.2f\n", dNum);
		System.out.printf("문자열 출력: %s\n", "소수정예 F 클래스");
		System.out.printf("%c반 %s과정 %.2f개강 %.2f종강 %b입니다", 'F',"공공데이터 개발자과정", 11.13, 4.25, true);
	}
}
