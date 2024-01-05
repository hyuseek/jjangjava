package org.jjang.day10.oop.motel.view;

import java.util.List;
import java.util.Scanner;

import org.jjang.day10.oop.motel.controller.MotelController;
import org.jjang.day10.oop.motel.model.vo.Room;

public class MotelView {
	MotelController mController;
	
	public MotelView() {
		mController = new MotelController();
	}
	
	public void launchProgram() {
		end:
		for (;;) {
			int choice = this.printMainMenu();
			switch (choice) {
			case 1:
				this.checkIn();
				break;
			case 2:
				this.checkOut();
				break;
			case 3:
				this.printAllRooms();
				break;
			case 4:
				System.out.println("프로그램 종료");
				break end;
			}
		}
	}

	public int printMainMenu() {
		System.out.println("\n모텔 관리 프로그램 v1.0");

		Scanner sc = new Scanner(System.in);
		System.out.print("1.입실 ");
		System.out.print("2.퇴실 ");
		System.out.print("3.방보기 ");
		System.out.println("4.종료");
		System.out.print("선택 > ");
		int input = sc.nextInt();
		return input;
	}

	public void checkIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번방에 입실하시겠습니까? ");
		int rnum = sc.nextInt();
		mController.checkIn(rnum);
	}

	public void checkOut() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇번방에서 퇴실하시겠습니까? ");
		int rnum = sc.nextInt();
		mController.checkOut(rnum);
	}

	public void printAllRooms() {
		int i=1;
		List<Room> rooms = mController.printAllRooms();
		for(Room r:rooms) {
			if(r.isAvailable()) {				
				System.out.println(i+"번째 방은 현재 손님이 있습니다.");
			} else {
				System.out.println(i+"번째 방은 현재 손님이 없습니다.");
			} i++;
		}
	}
}
