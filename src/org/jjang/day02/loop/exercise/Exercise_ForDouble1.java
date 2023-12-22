package org.jjang.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args) {
		for (int i=1; i<10; i++) {
			System.out.print("\n");
			for (int j=1; j<10; j++) {
				System.out.print(j+"*"+i+"="+j*i);
				System.out.print("\t");
			}
		}
	}
}