package 백준_연습문제.sec1_입출력과_사칙연산;

import java.util.Scanner;

public class level10_2588 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        System.out.println(a*(b%10));
        System.out.println(a*((b%100-b%10)/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);

    }
}
