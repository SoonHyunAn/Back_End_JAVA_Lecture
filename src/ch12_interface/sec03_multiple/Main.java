package ch12_interface.sec03_multiple;

import ch12_interface.sec02_interface.RemoteControllable;

public class Main {

	public static void main(String[] args) {
		RemoteControllable rc = new SmartTV();
		rc.turnOn();
		rc.setVolume(12);
		rc.turnOff();
		System.out.println();

		Searchable sc = new SmartTV();
		sc.search("Youtube");
		System.out.println();

		SmartTV stv = new SmartTV();
		stv.turnOn();
		stv.setVolume(5);
		stv.search("naver");
		stv.turnOff();
		System.out.println();

//		sc = new Searchable() { // 안씀
//			@Override
//			public void search(String url) {
//				System.out.println("익명 구현체가 " +url + "을/를 검색합니다.");
//			}
//		};
//		sc.search("kakao");
	}
}