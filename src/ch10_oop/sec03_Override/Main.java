package ch10_oop.sec03_Override;

public class Main {

	public static void main(String[] args) {
		// Person 객체
		Parent parent = new Parent();
		parent.parentField = 1000;
		parent.parentMethod();

		// Student 객체
		Child child = new Child();
		child.childField = 300;
		child.parentField = 600;
		child.childMethod();
		child.parentMethod();

//		Parent p = new Child();
//		Child c = (Child) new Parent(); // 강제 타입 변환
	}

}
