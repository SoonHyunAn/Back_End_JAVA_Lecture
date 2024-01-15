package ch02_type;

public class Ex01_Variable {

	public static void main(String[] args) {
		// boolean
		boolean a = true, b = false;
		System.out.println("a: " + a + ", b:" + b);

		// integer, long 은 뒤에 L 붙여야 함.
		byte w = 10;
		short x = 1024;
		int y = 1000000;
		long z = 300000000L;
		System.out.printf("%d, %d, %d, %d\n", w, x, y, z);

		// 실수, float 는 뒤에 F를 붙여야 함. 유효숫자 개수 중요
		float f1 = 1.0000001F, f2 = 1.00000001F;
		double d1 = 1.000000000000001, d2 = 1.0000000000000001;
		System.out.println("f1: " + f1 + ", f2: " + f2);
		System.out.println("d1: " + d1 + ", d2: " + d2);
		
		// 문자 (string)- 1글자
		char eng = 'A', kor = '안';
		System.out.println("eng: " + eng + ", kor: " + kor);
		
	}

}
