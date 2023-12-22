package org.jjang.day02.random;

import java.util.Random;
import java.util.Scanner;

public class Exam_Random {
	public static void main(String [] args) {
		Random rand = new Random();
		//0~9
		System.out.println(rand.nextInt(10));
		//25~35
		System.out.println(rand.nextInt(11)+25);
	}
}
