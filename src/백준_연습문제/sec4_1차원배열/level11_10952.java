package 백준_연습문제.sec4_1차원_배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class level11_10952 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String b = br.readLine();
            if (b.equals("0 0"))
                break;
            String[] c = b.split(" ");
            bw.write(Integer.parseInt(c[0]) + Integer.parseInt(c[1]) + "\n");
        }
        bw.flush();bw.close();br.close();
    }
}
