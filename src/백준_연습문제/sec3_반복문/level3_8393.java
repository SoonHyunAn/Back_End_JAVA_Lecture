package 백준_연습문제.sec3_반복문;

import java.util.Scanner;

public class level3_8393 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int sum = 0;
        for (int i = 1; i<=a ;i++)
            sum+=i;
        System.out.println(sum);
    }
}
