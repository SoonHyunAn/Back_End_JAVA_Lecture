package extra_Linux_GREP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q21_grep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("찾을 문자열");
        String search = scan.nextLine();
        System.out.println("찾을 파일");
        String filename = scan.nextLine();
        scan.close();

        grep(search, filename);
    }
    
    static void grep(String search, String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            int lineNo = 1;
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                String newLine = line.toLowerCase(); // 대소문자 구분 X
                if (newLine.contains(search.toLowerCase()))  // 그 라인에 포함된 값이 있는지
                    System.out.printf("%4d:\t%s\n",lineNo, line);
                lineNo++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
