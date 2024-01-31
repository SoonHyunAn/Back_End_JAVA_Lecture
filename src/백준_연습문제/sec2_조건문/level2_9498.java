package 백준_연습문제.sec2_조건문;

import java.util.Scanner;

public class level2_9498 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = Integer.parseInt(scan.nextLine());

        if (score / 10 >= 9) System.out.println("A");
        else if (score / 10 >= 8) System.out.println("B");
        else if (score / 10 >= 7) System.out.println("C");
        else if (score / 10 >= 6) System.out.println("D");
        else System.out.println("F");
    }
}