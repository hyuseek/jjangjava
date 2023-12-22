package org.jjang.day02.loop.exercise;

public class Exercise_for1 {
	public static void main(String [] args) {
		int sum = 0;
		String moonja = "";
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
			if(i<10)
				System.out.printf(i+"+");
			else
				System.out.printf(i+"=");
		}
		System.out.println(sum);
	}
}
