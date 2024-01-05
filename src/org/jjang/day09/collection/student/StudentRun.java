package org.jjang.day09.collection.student;

public class StudentRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentController sController = new StudentController();
		while (true) {
			int choice = sController.printMenu();
			switch (choice) {
			case 1:
				sController.inputScore();
				break;
			case 2:
				sController.printScore();
				break;
			case 3:
				sController.displayMsg("프로그램이 종료되었습니다.");
				break;
			default : 
				sController.displayMsg("1~3 사이의 수를 입력해주세요.");
				break;
			}
		}
	}

}
