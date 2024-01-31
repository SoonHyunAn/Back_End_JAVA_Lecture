package 백준_연습문제.sec2_조건문;

import java.util.Scanner;

public class level4_14681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.nextLine());
        int y = Integer.parseInt(scan.nextLine());
        if (x > 0 && y > 0) System.out.println("1");
        else if (x < 0 && y > 0) System.out.println("2");
        else if (x < 0 && y < 0) System.out.println("3");
        else System.out.println("4");
    }
}
