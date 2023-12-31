package org.jjang.day04.array.sort;

public class Exam_SelectionSort {
	public static void main(String[] args) {
		//선택정렬이란?
		//배열을 전부 검색하여 최소값을 고르고 왼쪽부터 채워나가는 정렬
		//알고리즘
		//특징: 데이터의 양이 적을 때 좋은 성늘을 보여주는 정렬이지만
		//데이터 양이 많을 때 급격한 성능 저하를 보임
		//배열의 n번 인덱스 값을 n+1번~마지막 인덱스까지 비교함
		int arrs[]= {2,5,4,1,3};
//		int temp=arrs[0];
//		arrs[0]=arrs[1];
//		arrs[1]=temp;
		// 1. 최솟값을 구한 뒤, 배열값 교환
		// 2. 최솟값을 구하면 배열이기 때문에 최솟값이 저장되어있는
		// 인덱스를 구해야 함.
		int min = 0;
		// 최솟값을 구하는 코드
		for(int j=0; j<arrs.length-1; j++) {			
			for(int i=j+1; i<arrs.length; i++) {			
				if(arrs[min]>arrs[i]) {
					min=i;
				}
			}
			int temp=arrs[j];
			arrs[j]=arrs[min];
			arrs[min]=temp;
		}
		
		for (int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
	}
}
