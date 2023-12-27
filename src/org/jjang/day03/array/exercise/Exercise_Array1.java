package org.jjang.day03.array.exercise;

import java.util.Scanner;

public class Exercise_Array1 {
	public static void main (String [] args) {
		int arrs[] = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<arrs.length; i++) {
			System.out.print("정수 입력: ");
			arrs[i]=sc.nextInt();
			sum += arrs[i];
		}
		System.out.println("평균: "+(double)sum/arrs.length);
		
//		int nums[]= new int[5];
//		int max=0;
//		Scanner sc = new Scanner(System.in);
//		for (int i=0; i<5; i++) {
//			System.out.print("정수 입력: ");
//			nums[i] = sc.nextInt();
//			if (max < nums[i]) max=nums[i];
//		}
//		System.out.println("최댓값: "+max);
	}
}
