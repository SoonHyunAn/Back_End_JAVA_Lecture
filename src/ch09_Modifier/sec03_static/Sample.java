package ch09_Modifier.sec03_static;

public class Sample {
	int instanceField;
	public static final int STATIC_FIELD = 2134;

	void instanceMethod() {
		System.out.println("instance Method");
	}

	static void staticMethod() {
		System.out.println("static Method");
	}
}
