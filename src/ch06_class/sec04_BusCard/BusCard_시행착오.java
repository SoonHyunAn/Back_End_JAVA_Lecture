//package ch06_class.sec04_BusCard;
//
//public class BusCard_시행착오 {
//	public int cash;
//	public int age;
//
//	public static final int CHILD_FARE = 730;
//	public static final int YOUTH_FARE = 1010;
//	public static final int ADILT_FARE = 1450;
//
//	public BusCard_시행착오() {
//	}
//
//	public BusCard_시행착오(int cash, int age) {
//		this.cash = cash;
//		this.age = age;
//	}
//
//	public int getCash() {
//		return cash;
//	}
//
//	public void setCash(int cash) {
//		this.cash = cash;
//	}
//
//	public int change(int a, int b) {
//
//		return a + b;
//	}
//
//	public static boolean ride(int wallet, int age) {
//		int cost = 0;
//		String person = "";
//		if (age >= 7 && age <= 12) {
//			cost = CHILD_FARE;
//			person = "child";
//		}
//		else if (age <= 18) {
//			cost = YOUTH_FARE;
//			person = "teen";
//		} else {
//			cost = ADILT_FARE;
//			person = "adult";
//		}
//
//		if (wallet < cost) {
//			wallet(person.getCash(), cost);
//			return false;
//		} else
//			return true;
//	}
//
//	public static int wallet(int wallet, int fee) {
//		return wallet - fee;
//	}
//
//	@Override
//	public String toString() {
//		return "BusCard [cash=" + cash + ", age=" + age + "]";
//	}
//
//}
