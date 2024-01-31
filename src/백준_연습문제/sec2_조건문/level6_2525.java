package 백준_연습문제.sec2_조건문;

import java.util.Scanner;

public class level6_2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int hour = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[1]);
        int time = Integer.parseInt(scan.nextLine());
        int hourPlus = time / 60;
        int minPlus = time % 60;

        hour += hourPlus;
        if (hour > 23) hour -= 24;
        min += minPlus;

        if (min >= 60) {
            min -= 60;
            hour++;
           if (hour == 24) hour = 0;
        }

        System.out.println(hour + " " + min);

    }
}

