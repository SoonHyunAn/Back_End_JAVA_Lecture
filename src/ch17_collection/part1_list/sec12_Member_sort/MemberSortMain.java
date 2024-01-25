package ch17_collection.part1_list.sec12_Member_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MemberSortMain {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		list.add(new Member(23, "제임스"));
		list.add(new Member(21, "마리아"));
		list.add(new Member(27, "브라이언"));
		list.add(new Member(31, "사라"));
		list.add(new Member(31, "사라")); // 같은 사람은 그냥 연달아 나옴
		list.add(new Member(33, "제임스"));

		// 이름: 오름차순, 나이: 내림차순으로 정렬
		list.sort(Comparator.naturalOrder());
		for (Member m : list)
			System.out.println(m);
	}

}
