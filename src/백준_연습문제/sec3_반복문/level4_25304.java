package 백준_연습문제.sec3_반복문;

import java.util.Scanner;

public class level4_25304 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine()); // 총액
        int b = Integer.parseInt(scan.nextLine()); // 반복문 횟수
        int sum = 0;
        for (int i = 1; i <= b; i++){
            String str = scan.nextLine();
            String[] strArr = str.split(" ");
            int c = Integer.parseInt(strArr[0]); // 가격
            int d = Integer.parseInt(strArr[1]); // 개수
            sum += c*d;
        }
        if (sum == a)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
