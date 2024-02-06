package 백준_연습문제.sec4_1차원_배열;

import java.util.Scanner;

public class level1_10807 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;
        int N = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        int b = scan.nextInt();

        for (int i : arr) {
            if (b == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
