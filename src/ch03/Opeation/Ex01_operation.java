package ch03.Opeation;

public class Ex01_operation {

	public static void main(String[] args) {
		int i = 2;
		int k = 3;
		double f = i / (double) k;
		System.out.printf("%d, %d, %d \n", k / i, i++, --k); // 1, 2, 2
		System.out.printf("%f, %d, %d \n", f, i++, --k); // 0.666667, 3, 1

		char c = '안';
		System.out.println(c == '안');// == 연산자는 프리미티브 타입의 값 비교

		String S = new String("Hello");
		System.out.println(S == "Hello"); // 참조형에서 - 에러는 안나지만 잘못된 연산, 주소의 값만 비교함(저장위치)
		System.out.println(S.equals("Hello")); // 참조형의 올바른 값 비교

		System.out.println(i == k);
		// System.out.println(i == k == i/k); 불가능

		// 성적이 70점 이상이면 합격, 그렇지 않으면 불합격
		int score = (int) (Math.random() * 60) + 40 ;
		char grade = score >= 70 ? '급': '낙';
		System.out.printf("%d: %c", score, grade);
		
		

	}
}
