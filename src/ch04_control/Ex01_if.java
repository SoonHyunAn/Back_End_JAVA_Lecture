package ch04_control;

public class Ex01_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 60 + (int) (41+Math.random());
		
		if (score >= 80)
			System.out.println(score + "점은 평균 이상입니다.");
		else
			System.out.println(score + "점은 평균 이하입니다.");
	}

}
