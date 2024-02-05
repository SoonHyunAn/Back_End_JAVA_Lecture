package 백준_연습문제.sec3_반복문;

import java.util.Scanner;

public class level5_25314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = a / 4;
        int c = a % 4;
        String result = "";
        for (int i = 1; i <= b; i++) {
            result += "long ";
        }
        if (c != 0) result += "long ";
        System.out.println(result + "int");


    }
}
