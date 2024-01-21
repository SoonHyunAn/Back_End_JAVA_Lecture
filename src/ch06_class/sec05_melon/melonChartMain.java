package ch06_class.sec05_melon;

public class melonChartMain {

	public static void main(String[] args) {
		melonChart[] melon = { new melonChart(1, "비의 랩소디", "임재현", "비의 랩소디", 33193),
				new melonChart(2, "To. X", "태연", "To. X - The 5th Mini Album", 33193),
				new melonChart(3, "Perfect Night", "르세라핌", "Perfect Night", 94989),
				new melonChart(4, "Drama", "Aespa", "Drama - The 4th Mini Album", 82783),
				new melonChart(5, "에피소드", "이무진", "에피소드", 33230) };
		for (melonChart show : melon) {
			System.out.println(show);
		}
	}
}