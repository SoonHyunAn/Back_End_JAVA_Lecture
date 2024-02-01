package extra_Challenge.Ex02_HexDump;

import java.io.BufferedReader;
import java.io.FileReader;


//2. HexaDump 이진파일
//0000: 0a 32 0b 17 1a c8 4f 6e  0a 0c 33 17 1a c8 4f 6e  .2....On ..3...On
//0010: 0a 0c 42 17 1a c8 6c 6e  74 0c 43 17 1a c8 6f 6d  ..B...ln t.C...om
//0020: 0a 0c 0b 17 1a c8 59 6e  0a 0c                    ......Yn ..

public class hexcode {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/WebProject/05. JAVA/lesson/src/extra_Challenge/Ex02_HexDump/Hexcode.txt"))) {
            String line;
            int lineNo = 0;
            while ((line = br.readLine()) != null) {
                String words = line.substring(5);
                String[] word = words.split(" ");
//                System.out.println(Arrays.toString(word));
                StringBuilder answer = new StringBuilder();
                int hex;
                int count = 0;
                for (String wo : word) {
                    hex = Integer.parseInt(wo, 16); // 16진수로 변환한다는 뜻
                    if (count == 8) answer.append(" ");
                    if (hex == 10 || hex == 13 || hex == 9) { // 대응되지 않는 값, 엔터값, Tap을 의미함.
                        answer.append("."); // 대응되지 않는 값을 "."으로
                        count++;
                        continue;
                    }
                    answer.append((char) hex);
                    count++;
                }
                count = 0;
                lineNo++;
                System.out.printf("%03x0: %s -> %s \n", lineNo, words, answer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
