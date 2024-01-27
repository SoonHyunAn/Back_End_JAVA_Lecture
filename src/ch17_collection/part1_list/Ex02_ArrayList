package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex02_ArrayList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>(); // 주로 사용
		ArrayList<String> aList = new ArrayList<String>(); // 잘안씀

		list.add("class");
		list.add("interface");
		list.add("inheritance");
		System.out.println(list);

		List<String> fruitList = Arrays.asList(new String[] { "apple", "banana", "cherry" });
		System.out.println(fruitList);
//		fruitList.add("mango"); // 정적인 리스트, 추가/삭제불가능
		
		// 프리미티브 타입은 Wrapper 클래스로 리스트를 생성해야 함
		List<Integer> numList = new ArrayList<>();
		numList.add(1);
		numList.add(3);
		numList.add(5);
		System.out.println(numList);

		// 추출-인덱싱
		System.out.println(list.get(1));

		// 데이터 추가
		list.add("list"); // 맨 뒤 추가
		list.add(3, "collection"); // 인덱스 위치에 추가
		System.out.println(list.get(3));
		System.out.println(list.get(4)); // 기존 값은 뒤로 밀림
		list.addAll(fruitList);
		System.out.println(list); // 추가하는 리스트값이 뒤에 자동으로 추가

		// 데이터 변경
		list.set(5, "set");
		System.out.println(list);

		// 데이터 삭제
		list.remove(6); // 6번 인덱스 삭제
		list.remove("cherry"); // cherry 값 삭제
		System.out.println(numList);
		numList.clear();// 리스트 원소 전체 삭제
//		fruitList.add("mango"); // 걍 망가짐
//		System.out.println(numList.size()); // 없는 값이기에 오류 발생
//		System.out.println(numlist.isEmpty()); // 있는 값인지 없는 값인지 확인 - boolean

		// 정보 추출
		System.out.println(numList.isEmpty() + ", " + numList.size());
		System.out.println(list.contains("set") + ", " + list.indexOf("list") + ", " + list.indexOf("list2"));

	}

}
