package 백준_연습문제.sec2_조건문;

import java.util.Scanner;

public class level5_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        if (min <= 45) {
            hour--;
            min = 15 + min;
            if (min == 60) {
                min = 0;
                hour++;
            }
            if (hour == 24) hour = 0;
            if (hour == -1) hour = 23;
        }
        else
            min -= 45;
        System.out.println(hour + " " + min);

    }
}
