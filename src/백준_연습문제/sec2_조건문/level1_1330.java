package 백준_연습문제.sec2_조건문;

import java.util.Scanner;

public class level1_1330 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        if(a>b)
            System.out.println(">");
        else if (a<b)
            System.out.println("<");
        else
            System.out.println("==");

    }
}
