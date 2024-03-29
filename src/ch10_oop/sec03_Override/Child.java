package ch10_oop.sec03_Override;

public class Child extends Parent{
	int childField;
	
	void childMethod() {
		System.out.println("childMethod(): " + childField);
	}
	
	// 메소드 재정의 - 부모가 정의한 메소드를 자식이 새롭게 재정의하는 것을 의미
	@Override
	void parentMethod () {
		System.out.println("child가 새롭게 정의한 ParentMethod() = " + parentField);
		super.parentMethod();
	}
}