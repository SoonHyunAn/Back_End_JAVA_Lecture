package ch05_reference;

public class Ex11_String {

	public static void main(String[] args) {
		// 생성
		String str1 = new String("문자열");
		String str2 = "문자열";

		byte[] bytes = { 72, 101, 108, 108, 111, 32, 77, 76, 54, 54 };
		String str3 = new String(bytes);
		System.out.printf("%s, %s, %s \n", str1, str2, str3);

		String str4 = "문자열";
		System.out.println(str2 == str4); // 주소값으로 가리키는 값이 동일함

		/*
		 * Object obj = null; obj.
		 */
		Person james = new Person("제임스", 29, "프로그래머");
		Person maria = new Person("마리아", 23, "학생");
		System.out.println(james);
		System.out.println(maria);
		System.out.println(james + " -123"); // Person Class의  toString() method 적용
		System.out.println(maria + " -456");
	}

}
