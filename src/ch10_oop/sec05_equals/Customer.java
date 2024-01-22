package ch10_oop.sec05_equals;

import java.util.Objects;

public class Customer {
	private int cid;
	private String name;
	private int age;
	private boolean adult;

	public Customer() {
	}

	public Customer(int cid, String name, int age, boolean adult) {
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.adult = adult;
	}

	public Customer(int cid, String name, int age) {
		this(cid, name, age, age > 19 ? true : false);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer costomer = (Customer) obj;
			// cid 값과 name이 같으면 동일한 객체
//			 return costomer.getCid() == cid && costomer.getName().equals(name);
			return this.cid == costomer.getCid() && this.name.equals(costomer.getName());
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", adult=" + adult + "]";
	}

	@Override
	public int hashCode() { // 중복이면 안된다.
		return Objects.hash(age, cid); // 두개가 같으면 같은 해쉬 코드가 형성된다.
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

}
