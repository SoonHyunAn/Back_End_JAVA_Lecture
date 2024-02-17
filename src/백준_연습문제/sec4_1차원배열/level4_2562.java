package 백준_연습문제.sec4_1차원_배열;

import java.util.Scanner;

public class level4_2562 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9];
        int index = 0;
        for(int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt();
        }
        int max = arr[0];
        for (int i=0; i<9;i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index+1);

    }
}
