package ch09_Modifier.sec02_access.abc;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;

	void abc() {
		System.out.println(a + b + c + d); // 다 가능
	}
}
