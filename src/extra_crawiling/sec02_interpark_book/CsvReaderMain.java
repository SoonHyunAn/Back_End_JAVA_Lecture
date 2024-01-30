package extra_crawiling.sec02_interpark_book;

import extra_crawiling.sec04_csv.CsvUtil;
import extra_crawiling.sec04_csv.CsvUtilImpl;

import java.io.IOException;
import java.util.List;

public class CsvReaderMain {
    public static void main(String[] args) throws IOException {
        CsvUtil csvUtil = new CsvUtilImpl();
        List<List<String>> csvList = csvUtil.readCsv("C:/Workspace/WebProject/05. JAVA/lesson/src/extra_crawiling/sec04_csv/interpark.csv", "\t");

        for (List<String> line : csvList) {
            InterparkBook ib = new InterparkBook(Integer.parseInt(line.get(0)), line.get(1), line.get(2), line.get(3), Integer.parseInt(line.get(4)));
            System.out.println(ib);
        }


    }

}
