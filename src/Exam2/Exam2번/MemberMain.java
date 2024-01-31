package Exam2.Exam2번;

import java.util.ArrayList;
import java.util.List;

public class MemberMain {
    public static void main(String[] args){
        Member james = new Member(1, "james", 1996, "010-1234-4567");
        Member maria = new Member(2, "maria", 1996, "010-9876-6541");
        // 3) 2)에서 만든 객체의 전화번호를 변경한 후 두 객체를 출력하세요
        james.setTel("010-1111-2222");
        maria.setTel("010-5454-6565");
        System.out.println(getMemberList(james,maria));
    }

    // 2) james, maria 두 객체를 ArrayList로 만들어 반환하는 메소드 getMemberList() 를 만드세요
    static List<Member> getMemberList(Member member, Member member2){
        List<Member> list = new ArrayList<>();
        list.add(member); list.add(member2);
        return list;
    }
}
