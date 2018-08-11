package ryu.java.ch01;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		int choice;
		System.out.println("용어 설명");
		System.out.print("1.객체");
		System.out.print("\t" + "2.클래스");
		System.out.print("\t" + "3.메서드");
		System.out.println("\t" + "4.상속");
		System.out.print("번호를 입력하세요 : ");
		choice = System.in.read();
		switch (choice) {
		case '1':
			System.out.println("객체");
			break;
		case '2':
			System.out.println("클래스");
			break;
		case '3':
			System.out.println("메서드");
			break;
		case '4':
			System.out.println("상속");
			break;

		default:
			System.err.println("error - 잘못된 번호입니다.");
		}
	}

}
