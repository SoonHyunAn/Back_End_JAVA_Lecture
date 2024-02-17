package 백준_연습문제.sec4_1차원_배열;

import java.util.Scanner;

public class level2_10950 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i : arr) {
            if (M > i) {
                if(M==arr.length)
                    System.out.print(i);
                System.out.print(i + " ");
            }
        }

    }
}
