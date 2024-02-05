package 백준_연습문제.sec3_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class level6_15552 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i <= a; i++) {
            String b = br.readLine();
            String[] acc = b.split(" ");
            bw.write("Case #" + i + ": " + Integer.parseInt(String.valueOf(Integer.parseInt(acc[0]) + Integer.parseInt(acc[1]))) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}