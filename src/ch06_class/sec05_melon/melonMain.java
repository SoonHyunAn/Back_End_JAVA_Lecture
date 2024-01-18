package ch06_class.sec05_melon;

import ch06_class.sec02_customer.Customer;

public class melonMain {

	public static void main(String[] args) {
		melon[] melon = { new melon(1, "비의 랩소디", "임재현", "비의 랩소디", 33193),
				new melon(2, "To. X", "태연", "To. X - The 5th Mini Album", 33193),
				new melon(3, "Perfect Night", "르세라핌", "Perfect Night", 94989),
				new melon(4, "Drama", "Aespa", "Drama - The 4th Mini Album", 82783),
				new melon(5, "에피소드", "이무진", "에피소드", 33230) };
		for (melon show : melon) {
			System.out.println(show);
		}
	}
}
