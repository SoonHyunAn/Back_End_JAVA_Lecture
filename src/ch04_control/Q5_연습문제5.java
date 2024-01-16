package ch04_control;

public class Q5_연습문제5 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 2)
					continue;
				if (j == 1)
					break;
				System.out.print("i값: " + i + ", j값: " + j);
				System.out.println("  A");
				count++;
			}
		}
		System.out.println("나온 횟수: " + count);
	}

}
