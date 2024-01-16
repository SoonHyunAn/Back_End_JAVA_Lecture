package ch04_control;

public class Q1_연습문제 {

	public static void main(String[] args) {
		int score = 72;
		if (score >= 80 && score < 90)
			System.out.println("B학점");
		else if (score >= 90)
			System.out.println("A학점");
		else if (score >= 70)
			System.out.println("C학점");
		else
			System.out.println("F학점");
	}
}
