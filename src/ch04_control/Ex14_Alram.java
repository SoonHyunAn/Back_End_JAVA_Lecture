//package ch04_control;
//
//import java.util.Scanner;
//
//// 알람시계: 알람 시각/분을 입력받아 45분 이전의 알람 시각
//public class Ex14_Alram {
//	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		System.out.print("시간 입력>  ");
//		String inputStr1 = scan.nextLine();
//		int H = Integer.parseInt(inputStr1);
//		System.out.print("분 입력>  ");
//		String inputStr2 = scan.nextLine();
//		int M = Integer.parseInt(inputStr2);
//
//		System.out.println("입력받은 시간: " + H + "시 " + M + "분");
//
//		if (M < 45) {
//			M = 60 - 45 + M;
//			H--;
//		} else
//			M -= 45;
//
//		if (H < 0)
//			H = 23;
//
//		System.out.println("조정된 시간: " + H + "시 " + M + "분");
//	}
//}

package ch04_control;

import java.util.Scanner;

// 알람시계: 알람 시각/분을 입력받아 45분 이전의 알람 시각
public class Ex14_Alram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("4글자로 시간 입력>  ");
		int allHour = Integer.parseInt(scan.nextLine()); //1230
		scan.close();
		int H = (int) allHour / 100; // 12
		int M = (int) allHour % 100; // 30

		System.out.println("입력받은 시간: " + H + "시 " + M + "분");

		if (M < 45) {
			M = 60 - 45 + M;
			H--;
		} else
			M -= 45;

		if (H < 0)
			H = 23;

		System.out.println("조정된 시간: " + H + "시 " + M + "분");
	}
}
