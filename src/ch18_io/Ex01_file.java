package ch18_io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Ex01_file {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Workspace/WebProject/05. JAVA/lesson/src/ch18_io/readme.txt");
        File dir = new File("C:/Workspace/WebProject/05. JAVA/lesson/src/ch18_io/test");

        if (!dir.exists()) {
            if (dir.mkdirs()) {
                System.out.println("디렉토리가 성공적으로 생성되었습니다");
            } else {
                System.err.println("디렉토리 생성 실패");
                return; // 디렉토리 생성에 실패하면 프로그램 종료
            }
        }

        // 파일을 만들기 전에 상위 디렉토리가 있는지 확인
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println("파일이 성공적으로 생성되었습니다");
            } else {
                System.err.println("파일 생성 실패");
            }
        }

        // cmd 창에서 dir \temp한 결과
        File temp = new File("C:/Temp");
        File[] contents = temp.listFiles();
        for (File content : contents)
            System.out.println(content);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
        for (File f : contents) {
            System.out.printf("%-24s", sdf.format(f.lastModified())); // 파일이 최후에 수정된 시간
            if (f.isDirectory())
                System.out.printf("%-14s %-20s \n", "<DIR>", f.getName());
            else
                System.out.printf("%,14d %-20s\n", f.length(), f.getName());
        }
    }
}

// 작성위치는 src, 실행 위치는 bin이니까 지정을 확실하게 해주어야 함.
