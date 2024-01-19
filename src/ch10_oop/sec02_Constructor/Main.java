package ch10_oop.sec02_Constructor;

public class Main {

	public static void main(String[] args) {
		// Person 객체
		Person person = new Person("제임스", 27);
		person.eat();
		person.sleep();

		// Student 객체
		Student student = new Student("마리아", 23, 1234);
		student.eat();
		student.sleep();
		student.study();

		// Worker 객체
		Worker worker = new Worker("브라이언", 32, 1234);
		worker.eat();
		worker.sleep();
		worker.work();

	}

}
