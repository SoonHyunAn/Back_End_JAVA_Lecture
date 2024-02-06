package 백준_연습문제.sec4_1차원_배열;

import java.util.Scanner;

public class level5_10810 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;
        int[] arr = new int[100];
        for (int i = 1; i < a; i++) {
            int c = scan.nextInt();
            int d = scan.nextInt();
            int e = scan.nextInt();
            for (int k = c-1; k <= d-1; k++) {
                if (arr[k] != 0) count--;
                if (count == b) break;
                arr[k] = e;
                count++;
            }
        }
        for (int j = 0; j < a; j++) {
            if (j == a - 1) {
                System.out.print(arr[j]);
                break;
            }
            System.out.print(arr[j] + " ");
        }

    }
}
