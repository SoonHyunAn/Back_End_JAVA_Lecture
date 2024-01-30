package 백준_연습문제.sec1_입출력과_사칙연산;

import java.util.Scanner;

public class level11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String all = scan.nextLine();
        long a = Long.parseLong(all.split(" ")[0]);
        long b = Long.parseLong(all.split(" ")[1]);
        long c = Long.parseLong(all.split(" ")[2]);
        long sum = a + b + c;
        System.out.println(sum);
    }
}
