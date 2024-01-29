package ch18_io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Ex03_OutputStream {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/output.txt");

            byte a = 0x41;
            char b = 'B';
            int c = 0x43;
            os.write(a);
            os.write(b);
            os.write(c);

            byte[] arr = {97, 98, 99, 100, 101};
            os.write(arr);
            os.write(arr, 1, 3); // offset이 1이고(하나 건너 뜀), length가 3(offset이후부터 개수)


            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
