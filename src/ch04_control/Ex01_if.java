package ch04_control;

public class Ex01_If {

	public static void main(String[] args) {
		int score1 = 60 + (int) (41 * Math.random());

		if (score1 >= 80)
			System.out.println(score1 + "점은 평균 이상입니다.");
		else
			System.out.println(score1 + "점은 평균 이하입니다.");

		char grade1;
		if (score1 >= 90)
			grade1 = 'A';
		else if (score1 >= 80)
			grade1 = 'B';
		else if (score1 >= 70)
			grade1 = 'C';
		else
			grade1 = 'D';
		System.out.println("score: " + score1 + ", grade: " + grade1);
		
		int score2 = 60 + (int) (41 * Math.random());
		char grade2;
		switch (score2/10) {
		case 10:
			grade2 = 'A'; break;
		case 9:
			grade2 = 'B'; break;
		case 8:
			grade2 = 'C'; break;
		default:
			grade2 = 'D'; break;
		}
		System.out.println("score: " + score2 + ", grade: " + grade2);
	}
}