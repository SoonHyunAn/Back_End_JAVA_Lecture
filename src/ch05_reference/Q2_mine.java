package ch05_reference;

import java.util.Scanner;

public class Q2_mine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("얼마나 큰 지뢰찾기를 만들까요?");
		int num = Integer.parseInt(scan.nextLine());
		System.out.println("지뢰를 얼마나 만들까요?");
		int min = Integer.parseInt(scan.nextLine());
		scan.close();

		String[][] mines = new String[num][num];
		int count = 0;
		for (int i = 0; i < mines.length; i++) {
			for (int k = 0; k < mines[i].length; k++) {
				if (min <= 0)
					continue;
				mines[i][k] = Math.random() > 0.9 ? "*" : ".";
				if (mines[i][k] == "*")
					min--;
			}
		}
		for (int i = 0; i < mines.length; i++) {
			for (int k = 0; k < mines[i].length; k++) {
				if (mines[i][k] == ".") {
					if (i == 0 && k == 0) {
						if (mines[i][k + 1] == "*")
							count++;
						if (mines[i + 1][k + 1] == "*")
							count++;
						if (mines[i + 1][k] == "*")
							count++;
					} else if (i == 0 && k == mines[i].length - 1) {
						if (mines[i][k - 1] == "*")
							count++;
						if (mines[i + 1][k - 1] == "*")
							count++;
						if (mines[i + 1][k] == "*")
							count++;
					} else if (i == mines[i].length - 1 && k == 0) {
						if (mines[i - 1][k] == "*")
							count++;
						if (mines[i - 1][k + 1] == "*")
							count++;
						if (mines[i][k + 1] == "*")
							count++;
					} else if (i == mines[i].length - 1 && k == mines[i].length - 1) {
						if (mines[i - 1][k - 1] == "*")
							count++;
						if (mines[i - 1][k] == "*")
							count++;
						if (mines[i][k - 1] == "*")
							count++;
					} else if (i == 0) {
						if (mines[i][k - 1] == "*")
							count++;
						if (mines[i][k + 1] == "*")
							count++;
						if (mines[i + 1][k - 1] == "*")
							count++;
						if (mines[i + 1][k] == "*")
							count++;
						if (mines[i + 1][k + 1] == "*")
							count++;
					} else if (i == mines[i].length - 1) {
						if (mines[i - 1][k - 1] == "*")
							count++;
						if (mines[i - 1][k] == "*")
							count++;
						if (mines[i - 1][k + 1] == "*")
							count++;
						if (mines[i][k - 1] == "*")
							count++;
						if (mines[i][k + 1] == "*")
							count++;
					} else if (k == 0) {
						if (mines[i - 1][k] == "*")
							count++;
						if (mines[i - 1][k + 1] == "*")
							count++;
						if (mines[i][k + 1] == "*")
							count++;
						if (mines[i + 1][k] == "*")
							count++;
						if (mines[i + 1][k + 1] == "*")
							count++;
					} else if (k == mines[i].length - 1) {
						if (mines[i - 1][k - 1] == "*")
							count++;
						if (mines[i - 1][k] == "*")
							count++;
						if (mines[i][k - 1] == "*")
							count++;
						if (mines[i + 1][k - 1] == "*")
							count++;
						if (mines[i + 1][k] == "*")
							count++;
					} else {
						if (mines[i - 1][k - 1] == "*")
							count++;
						if (mines[i - 1][k] == "*")
							count++;
						if (mines[i - 1][k + 1] == "*")
							count++;
						if (mines[i][k - 1] == "*")
							count++;
						if (mines[i][k + 1] == "*")
							count++;
						if (mines[i + 1][k - 1] == "*")
							count++;
						if (mines[i + 1][k] == "*")
							count++;
						if (mines[i + 1][k + 1] == "*")
							count++;
					}
					mines[i][k] = Integer.toString(count);
					count = 0;
				}
			}
		}
		for (int i = 0; i < mines.length; i++) {
			for (int k = 0; k < mines[i].length; k++) {
				if (mines[i][k] == null)
					mines[i][k] = Integer.toString(0);
			}
		}

		printMines(mines);
	}

	static void printMines(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int k = 0; k < arr[i].length; k++) {
				System.out.print(arr[i][k] + " ");
			}
			System.out.println();
		}

	}

}
