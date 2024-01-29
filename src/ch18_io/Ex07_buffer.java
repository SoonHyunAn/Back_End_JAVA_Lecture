package ch18_io;

import java.io.*;

public class Ex07_buffer {
    public static void main(String[] args) throws Exception {
        // buffer를 썼을 때와 안 썼을 때 비교

        // case 1 : 미사용
        InputStream is = new FileInputStream("C:/temp/eiffel.jpg");
        OutputStream os = new FileOutputStream("C:/temp/에펠.jpg");

        long noBufferTime =copy(is, os);
        System.out.println("버퍼 미사용: " + noBufferTime + " ns"); // 3,034,419,500 ns

        // case 2. 사용
        is = new BufferedInputStream(new FileInputStream("C:/temp/eiffel.jpg"));
        os = new BufferedOutputStream(new FileOutputStream("C:/temp/에펠.jpg"));

        long bufferTime = copy(is, os);
        System.out.println("버퍼 사용: " + bufferTime + " ns"); // 35,022,600 ns
        is.close(); os.close();
    }
    static long copy (InputStream is, OutputStream os) throws IOException {
        long startTime = System.nanoTime();
        // 1바이트씩 읽고 쓰기
        while (true){
            int data = is.read();
            if (data == -1)
                break;
            os.write(data);
        }
        os.flush();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
