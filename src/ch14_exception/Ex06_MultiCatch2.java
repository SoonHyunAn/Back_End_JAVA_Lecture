package ch14_exception;

public class Ex06_MultiCatch2 {

	public static void main(String[] args) {
		int value = 0;
		try {
			value = Integer.parseInt(args[0]);
		} catch (Exception e) { //굳이 각 예외사항을 지정해줄 필요가 없음
			e.printStackTrace();
			System.out.println("사용법: 매개변수가 필요하고, 숫자를 입력해야 합니다.");
		}
		System.out.println(value);
	}

}
