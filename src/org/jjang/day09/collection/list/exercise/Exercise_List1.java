package org.jjang.day09.collection.list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_List1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String longstr = "";
		for (int i=0; i<4; i++) {
			System.out.print("이름 입력: ");
			list.add(sc.next());
		}
		for (int i=0; i<4; i++) {
			System.out.println("이름: "+list.get(i));
			for (int j=0; j<4; j++) {
				if (list.get(i).length()<list.get(j).length()) {
					longstr = list.get(j);
				}
			}
		} System.out.println("가장 긴 이름: "+longstr);
	}
}
