package ch06_class.sec06_InterPark;
public class InterParkMain {
	public static void main(String[] args) {
		InterPark[] books = { new InterPark(1, "처음부터 시작하는 주식투자 단타전략", "홍인기", "길벗", 18900),
				new InterPark(2, "마흔에 읽는 쇼펜하우어","강용수","유노북스",15300),
				new InterPark(3, "세이노의 가르침","세이노","데이원",6480),
				new InterPark(4, "이처럼 사소한 것들","Claire Keegan","홍한별","다산책방",12420),
				new InterPark(5, "내가 생각한 인생이 아니야","류시화","수오서재",16200) };
		for (InterPark show : books) {
			System.out.println(show);
		}

	}

}
