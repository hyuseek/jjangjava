package org.jjang.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_if2 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하시겠어요? 가격을 알려드립니다");
		System.out.println("(에스프레소, 카푸치노, 카페라떼, 아메리카노)");
		System.out.print("메뉴를 입력해주세요: ");
		String menu = sc.next();
		
		switch(menu) {
			case "에스프레소": System.out.println("2500원"); break;
			case "카푸치노": System.out.println("3000원"); break;
			case "카페라떼": System.out.println("3500원"); break;
			case "아메리카노": System.out.println("1500원"); break;
			default: System.out.println("없는 메뉴입니다."); break;
		}
		
		if (menu.equals("에스프레소")) {
			System.out.println("2500원");
		} else if (menu.equals("카푸치노")) {
			System.out.println("3000원");
		} else if (menu.equals("카페라떼")) {
			System.out.println("3500원");
		} else if (menu.equals("아메리카노")) {
			System.out.println("1500원");
		} else {
			System.out.println("없는 메뉴입니다");
		};
		
		int price = 0;
		
		if (menu.equals("에스프레소")) {
			price = 2500;
		} else if (menu.equals("카푸치노")) {
				price = 3000;
		} else if (menu.equals("카페라떼")) {
			price = 3500;
		} else if (menu.equals("아메리카노")) {
			price = 1500;
		} else {
			System.out.println("없는 메뉴입니다");
		};
		if(price!=0) {
		System.out.println("가격은 "+price+"원입니다.");
		}
		
		switch(menu) {
		case "에스프레소": price=2500; break;
		case "카푸치노": price=3000; break;
		case "카페라떼": price=3500; break;
		case "아메리카노": price=1500; break;
		default: System.out.println("없는 메뉴입니다."); break;
		}
		if(price!=0) {
			System.out.println("가격은 "+price+"원입니다.");
		}
		
		
		// switch ~ case
		// switch(변수명){
		// 		case 값1: 실행문;break;
		// 		case 값2: 실행문;break;
		// 		case 값3: 실행문;break;
		// 		case 값4: 실행문;break;
		// 		case 값5: 실행문;break;
		// 		default: 실행문; break;}
	}
}
