package 백준_연습문제.sec4_1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class level9_2438 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i <= a; i++) {
            for (int k =0; k<i;k++)
                bw.write("*");
            bw.write("\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }

}