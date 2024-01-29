package ch18_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02_InputStream {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:/Temp/readme.txt");
//        is = new FileInputStream(new File("C:/Temp/readme2.txt"));

        // 읽는 방법 1
        while (true) {
            int data = is.read(); // 1 바이트를 읽어서 정수형으로 반환
            if (data == -1)       // 마지막
                break;
            System.out.println((char) data); // 한글은 깨짐
        }
        is.close();

        // 읽는 방법 2
        is = new FileInputStream("C:/Temp/readme.txt");
        byte[] arr = new byte[512];
        while (true) {
            int num = is.read(arr);
            if (num == -1)
                break;
            System.out.println("읽은 바이트 수: " + num);
        }
        System.out.println(new String(arr));
        is.close();
    }
}
