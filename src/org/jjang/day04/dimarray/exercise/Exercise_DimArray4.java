package org.jjang.day04.dimarray.exercise;

public class Exercise_DimArray4 {
	public static void main(String[] args) {
		int nums [][]=new int[5][5];
		int k=1;
//		for (int i=0; i<nums.length; i++) {
//			for(int j=0; j<nums[i].length; j++) {
//				nums[i][j]=k++;
//			}
//		}
		for (int i=0; i<nums.length; i++) {
			if (i%2==0) {				
				for(int j=0; j<nums[i].length; j++) {
					nums[i][j]=k++;
				}
			} else if (i%2==1) {				
				for(int j=nums[i].length-1; j>=0; j--) {
					nums[i][j]=k++;
				}
			}
		}
		for(int j=0; j<nums.length; j++) {			
			for(int i=0; i<nums[j].length; i++) {
				System.out.print(nums[j][i]+"\t");
			} System.out.println();
		}
	}
}
