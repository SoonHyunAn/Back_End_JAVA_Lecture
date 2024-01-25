package ch17_collection.part3_map;

import java.util.Map;
import java.util.TreeMap;

import ch17_collection.part2_set.sec12_Member.Member;

public class Ex03_MemberTreeMap {
	public static void main(String[] args) {
		Map<Integer, Member> map = new TreeMap<Integer, Member>();
		map.put(101, new Member(21, "james"));
		map.put(102, new Member(24, "maria"));
		map.put(103, new Member(21, "brian"));
		map.forEach((k, v) -> System.out.println(k + ": " + v));
		
		Map<Member, Integer> map2 = new TreeMap<Member, Integer>();
		map2.put(new Member(21, "james"), 100000);
		map2.put(new Member(24, "maria"), 300000);
		map2.put(new Member(21, "brian"), 150000);
		map2.put(new Member(21, "james"), 200000); // 기존에 있던 제임스에 덮어씌워짐.
		map2.forEach((k, v) -> System.out.println(k + ": " + v));

	}
}
