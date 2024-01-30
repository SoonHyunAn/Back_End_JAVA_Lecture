package extra_Linux_GREP;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q22_wordCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:/Workspace/WebProject/05. JAVA/lesson/src/extra_Linux_GREP/wordCount.txt"));
        String[] acc1 = {};
        String[] acc2 = {};
        String line = br.readLine();
        acc1 = line.split("");
        acc2 = line.split(" ");
        int word  = acc1.length;
        int words = acc2.length;
        br.close();
        System.out.println("주어진 파일의 글자수는 " + word + "개, 단어수는 " + words + "개 입니다.");
    }
}
