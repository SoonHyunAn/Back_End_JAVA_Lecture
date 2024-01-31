package 백준_연습문제.sec2_조건문;

import java.util.Scanner;

public class level7_2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int max = 0;

        if (a == b && b == c) System.out.println(10000 + (a * 1000));
        else if (a == b) {
            System.out.println(1000 + a * 100);
        } else if (c == b) {
            System.out.println(1000 + c * 100);
        } else if (a == c) {
            System.out.println(1000 + a * 100);
        } else {
            max = a;
            if (max < b) max = b;
            if (max < c) max = c;
            System.out.println(max*100);
        }

    }
}
