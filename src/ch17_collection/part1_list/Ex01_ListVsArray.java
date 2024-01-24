package ch17_collection.part1_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex01_ListVsArray {

	public static void main(String[] args) {
		String[] array = "가나다라마바사".split("");
		System.out.println(Arrays.toString(array));

		List<String> list = new ArrayList<>();
		// 구현 객체(ArrayList)에 있는 <String>에서 String 생략가능
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		list.add("마");
		list.add("바");
		list.add("사");
		for (String element : list) // 1번
			System.out.print(element + " ");
		System.out.println();
		list.forEach(x -> System.out.print(x + " ")); // 2번
		System.out.println();
		System.out.println(list); // 3번, 이거쓰기, toString 불필요

		// 삭제
		array[2] = null;
		array[5] = null;
		System.out.println(Arrays.toString(array));

		list.remove("다");
		list.remove("바");
		System.out.println(list);

		// 삭제 후 크기 비교
		System.out.println(array.length + " " + list.size()); // 7, 5

		// 추가(삽입)
		list.add("아");
		list.add("자");
		list.add("차");
		System.out.println(list);
		
		// 추가 후 크기 비교
		System.out.println(array.length + " " + list.size()); // 7, 8
	}

}
