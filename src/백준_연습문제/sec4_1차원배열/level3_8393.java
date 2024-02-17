package 백준_연습문제.sec4_1차원_배열;

import java.util.Scanner;

public class level3_8393 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        int max = -1000000;
        int min = 1000000;
        for (int i : arr) {
            if (max < i) {
              max = i;
            }
            if (min > i) {
                min = i;
            }
        }
        System.out.println(min + " " +max);

    }
}
