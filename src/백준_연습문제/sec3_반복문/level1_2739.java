package 백준_연습문제.sec3_반복문;

import java.util.Scanner;

public class level1_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", a, i, a * i);
        }
    }
}
