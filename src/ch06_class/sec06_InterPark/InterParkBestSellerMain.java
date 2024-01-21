package ch06_class.sec06_InterPark;

import java.util.ArrayList;
import java.util.List;

public class InterParkBestSellerMain {
	public static void main(String[] args) {
		InterParkBestSeller bestSeller1 = new InterParkBestSeller();
		InterParkBestSeller bestSeller2 = new InterParkBestSeller(1, "처음부터 시작하는 주식투자 단타전략", "홍인기", "길벗", 18900);
		InterParkBestSeller[] books = { 
				new InterParkBestSeller(2, "마흔에 읽는 쇼펜하우어","강용수","유노북스",15300),
				new InterParkBestSeller(3, "세이노의 가르침","세이노","데이원",6480),
				new InterParkBestSeller(4, "이처럼 사소한 것들","Claire Keegan","홍한별","다산책방",12420),
				new InterParkBestSeller(5, "내가 생각한 인생이 아니야","류시화","수오서재",16200) };
		for (InterParkBestSeller show : books) {
			System.out.println(show);
		}
		
		System.out.println();
		
		//실전 코드 (list)
		List<InterParkBestSeller> list = new ArrayList<>();
		list.add(bestSeller1); list.add(bestSeller2); 
		list.add(new InterParkBestSeller(2, "마흔에 읽는 쇼펜하우어","강용수","유노북스",15300));
		list.add(new InterParkBestSeller(3, "세이노의 가르침","세이노","데이원",6480));
		list.add(new InterParkBestSeller(4, "이처럼 사소한 것들","Claire Keegan","홍한별","다산책방",12420));
		list.forEach(x -> System.out.println(x));

	}

}