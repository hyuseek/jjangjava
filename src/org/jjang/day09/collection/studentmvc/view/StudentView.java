package org.jjang.day09.collection.studentmvc.view;

import java.util.List;
import java.util.Scanner;

import org.jjang.day09.collection.student.Student;
import org.jjang.day09.collection.studentmvc.controller.StudentController;

public class StudentView {
	
	StudentController sController;
	public StudentView() {
		sController = new StudentController();
	}
	public void startProgram() {		
		end:
		while (true) {
			int choice = this.printMenu();
			switch (choice) {
			case 1:
				this.inputScore();
				break;
			case 2:
				this.printScore();
				break;
			case 3:
				this.displayMsg("프로그램이 종료되었습니다.");
				break;
			default : 
				this.displayMsg("1~3 사이의 수를 입력해주세요.");
				break;
			}
		}
	}
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====메인메뉴=====");
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 출력");
		System.out.println("3. 종료");
		System.out.print("선택: ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("첫번째 점수: ");
		int firstScore = sc.nextInt();
		System.out.print("두번째 점수: ");
		int secondScore = sc.nextInt();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);
		sController.addStudent(student);
//		for(int i = 0; i <students.length; i++) {			
//			students[i] = new Student();
//			System.out.print("이름: ");
//			//students[i].name = sc.next();
//			students[i].setName(sc.next());
//			System.out.print("첫번째 점수: ");
//			//students[i].firstScore = sc.nextInt();
//			students[i].setFirstScore(sc.nextInt());
//			System.out.print("두번째 점수: ");
//			//students[i].secondScore = sc.nextInt();
//			students[i].setSecondScore(sc.nextInt());
//		}
	}

	public void printScore() {
		List<Student> students = sController.allStudentList();
		for (int i = 0; i < students.size(); i++) {
			System.out.println("=======" + (i + 1) + "번째 학생의 정보 출력 =========");
			System.out.printf("%s 학생의 첫번째 점수 %d점, 두번째 점수는 %d점입니다. \n", students.get(i).getName(),
					students.get(i).getFirstScore(), students.get(i).getSecondScore());
		}
//		for(int i=0; i<students.length; i++) {
//			System.out.println("======="+(i+1)+"번째 학생의 정보 출력 =========");
//			System.out.printf("%s 학생의 첫번째 점수 %d점, 두번째 점수는 %d점입니다. \n", students[i].getName(), students[i].getFirstScore(), students[i].getSecondScore());
//		}
	}

	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
