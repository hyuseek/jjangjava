package org.jjang.day04.dimarray;

public class Exam_DimArray {
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		int num = 0;
		int nums [] = new int[10];
		int dimNums [][]=new int[2][5];
		System.out.println("앞의 크기: "+dimNums.length);
		System.out.println("뒤의 크기1: "+dimNums[0].length);
		System.out.println("뒤의 크기2: "+dimNums[1].length);
		
		int arrs[][]=new int[4][4];
		int k = 1;
		//2차원 배열에 값 입력하기
		for(int j=0; j<arrs.length; j++) {			
			for(int i=0; i<arrs[j].length; i++) {
				arrs[j][i]=k++;
			}
		}
		for(int j=0; j<arrs.length; j++) {			
			for(int i=0; i<arrs[j].length; i++) {
				System.out.print(arrs[j][i]+" ");
			} System.out.println();
		}
//		for(int i=0; i<arrs.length; i++) {
//			arrs[1][i]=1;
//		}
//		for(int i=0; i<arrs.length; i++) {
//			arrs[2][i]=1;
//		}
//		for(int i=0; i<arrs.length; i++) {
//			arrs[3][i]=1;
//		}
	}
}
