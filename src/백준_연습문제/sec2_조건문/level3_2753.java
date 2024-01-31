package 백준_연습문제.sec2_조건문;

import java.util.Scanner;

public class level3_2753 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = Integer.parseInt(scan.nextLine());
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("1");
        else
            System.out.println("0");
    }
}
