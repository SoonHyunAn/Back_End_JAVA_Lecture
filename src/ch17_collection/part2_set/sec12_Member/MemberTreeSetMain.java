package ch17_collection.part2_set.sec12_Member;

import java.util.Set;
import java.util.TreeSet;

public class MemberTreeSetMain {

	public static void main(String[] args) {
		Set<Member> set = new TreeSet<Member>();

		Member m1 = new Member(21, "젬");
		Member m2 = new Member(20, "마리아");
		Member m3 = new Member(41, "젬"); // 나이 비교로 추가함
		Member m4 = new Member(20, "마리아");
		set.add(m1);
		set.add(m2);
		set.add(m3);
		set.add(m4);
		System.out.println(set); // 마리아가 젬보다 가나다순으로 앞에 있기 때문에 

	}
}
