package org.jjang.day04.array.sort;

public class Exam_InsertionSort {
	public static void main(String[] args) {
		// 삽입정렬
		// 정렬 알고리즘 중에 하나, 가장 간단하고 기본이 되는 알고리즘
		// 배열의 N번 인덱스값을 0번에서 n-1번 인덱스까지 비교~!
		// N은 1부터 시작
		// {2, 5, 4, 1, 3}
		// 오름차순, 작은 거 찾아야 됨
		// 첫번째 동작: 2와 5를 비교 -> 변화 X
		// 두번째 동작1: 2와 4를 비교
		// 두번째 동작2: 5와 4를 비교 -> 교환
		int arrs[] = {2, 5, 4, 1, 3};
//		// 첫번째 동작
//		if(arrs[0] > arrs[1]) {
//			int temp = arrs[1];
//			arrs[1]=arrs[0];
//			arrs[0]=temp;
//		}
//		// 두번째 동작
//		if(arrs[1]>arrs[2]) {
//			int temp = arrs[2];
//			arrs[2] = arrs[1];
//			arrs[1] = temp;
//		}
//		if(arrs[0] > arrs[2]) {
//			int temp = arrs[2];
//			arrs[2]=arrs[0];
//			arrs[0]=temp;
//		}
		for(int i = 1; i < arrs.length; i++) {			
			for (int j=i; j>=1; j--) {
				if(arrs[j-1]>arrs[j]) {
					int temp = arrs[j];
					arrs[j]=arrs[j-1];
					arrs[j-1]=temp;
				}
			}
		}
		
//	이건 제대로 작동 X
//		for (int i = 1; i<arrs.length; i++) {
//			for (int j=i-1; j>=0; j--) {
//				if(arrs[j] > arrs[i]) {
//					int temp = arrs[i];
//					arrs[i]=arrs[j];
//					arrs[j]=temp;
//				}
//			}
//		} 
		
//		for (int i = 1; i < arrs.length; i++) {
//			 int key = arrs[i];
//			 int j = i - 1;
//
//		    while (j >= 0 && arrs[j] > key) {
//		        arrs[j + 1] = arrs[j];
//		        j = j - 1;
//		    }   arrs[j + 1] = key;
//		}
		
//		for (int i = 1; i<arrs.length; i++) {
//			for (int j=0; j<i; j++) {
//				if(arrs[j] > arrs[i]) {
//					int temp = arrs[i];
//					arrs[i]=arrs[j];
//					arrs[j]=temp;
//				}
//			}
//		} 
		for (int i=0; i<arrs.length; i++) {
			System.out.print(arrs[i]+" ");
		}
	}
}
