package ch18_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex04_Copy {
    public static void main(String[] args) {
        String srcFile = "C:/temp/cat.jpg";
        String dstFile = "C:/temp/고양이.jpg";

        try (InputStream is = new FileInputStream(srcFile);
             OutputStream os = new FileOutputStream(dstFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }

            System.out.println("Copy is done!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
