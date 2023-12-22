package org.jjang.day02.loop.exercise;

public class Exercise_ForDouble3 {
	public static void main(String [] args) {
		String star = "";
		for (int i=0; i<5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		for(int i=0; i<5; i++) {
			for(int j = 0; j <i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
