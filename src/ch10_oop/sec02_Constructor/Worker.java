package ch10_oop.sec02_Constructor;

public class Worker extends Person {
	int workerId;

	public Worker(String name, int age, int workerId) {
		super(name, age);
		this.workerId = workerId;
	}

	public void work() {
		System.out.println(name + "이/가 열심히 일을 합니다.");
	}
}
