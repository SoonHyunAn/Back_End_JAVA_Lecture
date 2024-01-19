package ch09_Modifier.sec02_access.xyz;

import ch09_Modifier.sec02_access.abc.A;

public class C {
	void xyz() {
		A a = new A();
		System.out.println(a.a); // 다른 클래스의  a변수(public)만 사용 가능 나머진 불가능
	}
}
