package ch01_intro;

// class 이름은 대문자로 시작
public class Ex01_HelloWorld {
	/**
	 * Document 주석 - API document를 만들 때 사용하는 주석 (/** 후 엔터)
	 * 
	 * @param args
	 */

	// method 이름 main 은 소문자로 시작
	public static void main(String[] args) {
		System.out.println("Hello World!!!"); // ;(세미콜론)필수
		System.out.println("안녕하세요?" + "여러분!!!"); // ,(콤마)로는 스트링 연결 불가능(대신 +기호를 사용)
		// Ctrl + / : 문장을 커멘드 처리
	}
}
