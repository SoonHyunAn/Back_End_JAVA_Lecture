package 백준_연습문제.sec4_1차원_배열;

import java.util.Scanner;

public class level5_10810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            int c = scan.nextInt();
            int d = scan.nextInt();
            int e = scan.nextInt();
            for (int k = c-1; k <= d-1; k++)
                arr[k] = e;
        }
        for (int j = 0; j < arr.length; j++) {
            if (j == n - 1) {
                System.out.print(arr[j]);
                break;
            }
            System.out.print(arr[j] + " ");
        }

    }
}
