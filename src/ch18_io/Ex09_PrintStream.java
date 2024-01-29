package ch18_io;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex09_PrintStream {
    public static void main(String[] args) throws Exception {
        PrintStream ps = new PrintStream(new FileOutputStream("C:/temp/print.txt", true));
        // append를 하면 기존에 있던 값에 아래 내용을 추가함 (true의 경우) -- 할때마다 새로 추가
        // append가 없으면 overwrite mode

        ps.print("마치 ");
        ps.println("System.out이 출력하는 것 처럼 ");
        ps.println("데이터를 출력합니다. ");
        ps.println("아래와 같이 포맷티트 출력도 가능합니다. ");
        ps.printf("%-6s, %8d\n", "딸기", 12000);
        ps.printf("%-6s, %8d\n", "사과", 3000);

        ps.flush();
        ps.close();
    }
}
