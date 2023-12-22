package org.jjang.day02.loop;

public class Exam_ForDouble {
	public static void main(String [] args) {
		for(int i=1; i<10; i++) {
			System.out.print("1 * "+i+" = "+1*i);
			System.out.print("\n");
		}
		for(int i=1; i<10; i++) {
			System.out.print("2 * "+i+" = "+2*i);
			System.out.print("\n");
		}
		for(int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
			System.out.print(i+" * "+j+" = "+i*j);
			System.out.print("\n");
			}
		}
	}
}
