package ch09_Modifier.sec02_access.abc;

public class B {
	void abc() {
		A a = new A();
		System.out.println(a.a + a.b + a.c); //  + a.d는 불가능 (private)
	}
	
}
