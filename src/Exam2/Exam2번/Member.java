package Exam2.Exam2번;

import java.time.LocalDateTime;

// 1) Member 클래스
public class Member {
    int nowYear = LocalDateTime.now().getYear();
    private int mid;
    private String name;
    private int birthYear;
    private String tel;

    public Member() {
    }

    public Member(int mid, String name, int birthYear, String tel) {
        this.mid = mid;
        this.name = name;
        this.birthYear = birthYear;
        this.tel = tel;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "ID: " + mid + ", 이름: " + name + ", 나이: " + (nowYear - birthYear) + ", 전화번호: " + tel;
    }
}
