package ch18_io;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class Ex05_Reader {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/temp/readme.txt");

        // 1문자씩 읽기
        while (true) {
            int data = reader.read();
            if (data == -1)
                break;
            System.out.print((char) data);
        }
        reader.close();
        System.out.println();System.out.println();System.out.println();



        // 문자 배열로 읽기.
        reader = new FileReader(new File("C:/temp/readme.txt"));
        char[] buffer = new char[100];
        while (true) {
            int num = reader.read(buffer);
            System.out.println("읽은 문자 수: " + num);
            if (num == -1)
                break;
            System.out.println(new String(buffer));
        }
    }
}
