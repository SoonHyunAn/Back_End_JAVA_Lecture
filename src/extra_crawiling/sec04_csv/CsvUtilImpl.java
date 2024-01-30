package extra_crawiling.sec04_csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvUtilImpl implements CsvUtil {

    @Override
    public List<List<String>> readCsv(String filename) {
        return readCsv(filename, ",", 0);
    }

    @Override
    public List<List<String>> readCsv(String filename, String separator) {
        return readCsv(filename, separator, 0);
    }

    @Override
    public List<List<String>> readCsv(String filename, int skipLine) {
        return readCsv(filename, ",", skipLine);
    }

    @Override
    public List<List<String>> readCsv(String filename, String separator, int skipLine) {
        List<List<String>> csvList = new ArrayList<List<String>>();
        BufferedReader br = null;
        int lineNo = 0;
        try {
            br = new BufferedReader(new FileReader(filename));
            while (true) {
                String line = br.readLine();
                if (line == null) break;
                if (skipLine > lineNo++) continue;
                String[] lineArray = line.split(separator);
                csvList.add(Arrays.asList(lineArray)); // 아래 4줄과 같음
//                List<String> lineList = new ArrayList<>();
//                for (String w : lineArray)
//                    lineList.add(w);
//                csvList.add(lineList);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return csvList;
    }

    @Override
    public void writeCsv(String filename, List<List<String>> dataList) {
        writeCsv(filename, dataList, ",");
    }

    @Override
    public void writeCsv(String filename, List<List<String>> dataList, String separator) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(filename));
            for (List<String> data : dataList) {
                String line = "";
                for (int i = 0; i < data.size(); i++) {
                    line += data.get(i);
                    if (i < data.size() - 1) line += separator; // 마지막을 제외하고 한 줄이 완료되었을 때 separator 입력
                }
                bw.write(line + "\n"); // 끝나면 줄바꿈
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bw.flush();
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
