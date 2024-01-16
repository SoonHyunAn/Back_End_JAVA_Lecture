package ch04_control;

import java.util.Scanner;

public class Ex11_For {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++)
			sum += i;
		System.out.println("1~100 까지 합: " + sum);

		int oddSum = 0;
		for (int i = 1; i <= 100; i += 2)
			oddSum += i;
		System.out.println("1~100 까지 홀수 합: " + oddSum);

		int divSum = 0;
		int num = 24;
		for (int i = 1; i < 24; i++) {
			if (num % i == 0)
				divSum += i;
		}
		System.out.println(num + "의 자기자신을 제외한 약수의 합: " + divSum);

		// 초기식 증감식에 여러개의 변수 사용 가능
		for (int i = 1, k = 2; i * k < 10; i++, k++)
			System.out.println("i= " + i + ", k= " + k);

		// 사용자가 5번 입력한 문자열을 받아서 공백을 사이에 넣고
		// 하나의 문자열로 만들어서 출력
		Scanner scan = new Scanner(System.in);
		String txt = "";
		for (int i = 0; i < 5; i++) {
			System.out.println("글자입력>");
			String inputStr = scan.nextLine();
			txt += inputStr;
		}
		scan.close();
		System.out.println(txt);
		
		// Enhenced for loop
		String[] fruits = { "apple", "banana", "cherry" };
		for (String fruit : fruits)
			System.out.println(fruit);
	}
}