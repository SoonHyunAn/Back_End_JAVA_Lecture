//package ch04_control;
//
//public class Q2_연습문제2 {
//
//	public static void main(String[] args) {
//		int score = 72;
//		switch (score/10) {
//		case 9:
//			System.out.println("A학점");
//			break;
//		case 8:
//			System.out.println("B학점");
//			break;
//		case 7: 
//			System.out.println("C학점");
//			break;
//		default: 
//			System.out.println("F학점");
//			break;
//		}
//	}
//
//}
package ch04_control;

public class Q2_연습문제2 {

	public static void main(String[] args) {
		int score = 72;
		String grade = "";
		switch (score / 10) {
		case 10: // 100점은 자연스레 90점대와 같은 점수로
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		default:
			grade = "F";
		}
		System.out.println(grade + "학점");
	}

}
