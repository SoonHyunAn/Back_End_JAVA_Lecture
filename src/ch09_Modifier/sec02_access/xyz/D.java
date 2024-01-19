package ch09_Modifier.sec02_access.xyz;

import ch09_Modifier.sec02_access.abc.A;

public class D extends A {
	void xyz() {
		System.out.println(a + b); 
		// 다른 패키지의 변수를 extends를 이용해 publuc과 protect는 사용할 수 있지만 
		// default와 private는 사용할 수 없다.
	}
}
