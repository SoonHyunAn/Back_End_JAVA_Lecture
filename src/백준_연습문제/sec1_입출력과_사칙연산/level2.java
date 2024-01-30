package 백준_연습문제.sec1_입출력과_사칙연산;

import java.util.Scanner;

public class level2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String all = scan.nextLine();
        int a =Integer.parseInt(all.split(" ")[0]);
        int b = Integer.parseInt(all.split(" ")[1]);
        System.out.println(a + b);
    }
}
