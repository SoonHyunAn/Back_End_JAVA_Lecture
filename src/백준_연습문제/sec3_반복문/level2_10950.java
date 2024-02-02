package 백준_연습문제.sec3_반복문;

import java.util.Scanner;

public class level2_10950 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        for (int i = 1; i <= a; i++){
            String str = scan.nextLine();
            String[] strArr = str.split(" ");
            int b = Integer.parseInt(strArr[0]);
            int c = Integer.parseInt(strArr[1]);
            System.out.println(b + c);
        }
    }
}
