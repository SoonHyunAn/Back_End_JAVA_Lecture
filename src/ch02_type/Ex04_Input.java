package ch02_type;

import java.io.IOException;

import java.util.Scanner;

public class Ex04_Input {
	public static void main(String[] args) throws IOException {
//		// 하나의 문자를 읽을 때 사용하나, 잘 안씀
//		int keyCode = System.in.read(); // '5'
//		System.out.println("keyCode: " + keyCode); // 0x35 == 3*16 + 5
//		
		Scanner scan = new Scanner(System.in);
		System.out.print("입력하세요> ");
		String inputText = scan.nextLine(); // 엔터를 칠 때까지 입력을 저장함
		System.out.println(inputText);
	}
}
