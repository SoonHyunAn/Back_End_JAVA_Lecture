package ch05_reference;

import java.util.Arrays;

public class Ex04_MainArgs {

	public static void main(String[] args) { // 매개변수는 항상 String
		System.out.println(Arrays.toString(args));
		
		String[] command = "git add .".split(" ");
		command = "git  commit 	-m \"Reference Type\"".split("\\s+"); // 공백 여러개로 분리
		System.out.println(Arrays.toString(command));
	}

}