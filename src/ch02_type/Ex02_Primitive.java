package ch02_type;

public class Ex02_Primitive {
	private static int num = 2;
	
	public static void main(String[] args) {
		int age;
		age = 21;
		int score = 88; // 변수를 선언하면서 초기화를 동시에 해주는 것을 권장
		var value = age * score; // Java 8에서는 못씀
		System.out.println("age : " + age + ", score: " + score + ", value: " + value);

		/*
		 * 변수 이름 규칙 (필수)
		 * 1. 영문 대소문자 및 한글 사용 가능 
		 * 2. 특수문자는 두 가지만 표현 가능: '_', '$' 
		 * 3. 숫자 사용가능 단, 변수의 첫번째는 올 수 없음
		 * 4. 자바에서 사용중인 키워드 사용 불가
		 * 
		 * 변수 이름 규칙 (권고)
		 * 1. 변수의 이름은 소문자로 시작
		 * 2. 두개 이상의 단어가 결합된 경우 새 단어는 대문자로 시작(Camel Notation)
		 *
		 * 상수 이름 규칙
		 * 모든 문자를 대문자
		 * 두개 이상의 단어는_로 연결 (Snake Notation)
		 */
		
		if (age >= 19) {
			System.out.println("음주 허용");
			int num = 5;
			System.out.println(num); // if 문 밖에서 사용 불가
		}
		System.out.println(num); // 전역으로 num을 설정하면 사용가능
	}

}
