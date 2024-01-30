package extra_crawiling.sec03_melon;

import extra_crawiling.sec04_csv.CsvUtil;
import extra_crawiling.sec04_csv.CsvUtilImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        MelonChartService melonChartService = new MelonChartService();
        List<MelonChart> list = melonChartService.getMelon();
        for (MelonChart x : list) {
            System.out.println(x);
        }
        CsvUtil csvUtil = new CsvUtilImpl();

        List<MelonChart> list2 = melonChartService.getMelon();
        List<List<String>> csvList = new ArrayList<>();
        for (MelonChart ib : list) {
            List<String> line = new ArrayList<>();
            line.add(ib.getRank() + "\t");
            line.add(ib.getTitle() + "\t");
            line.add(ib.getArtist() + "\t");
            line.add(ib.getAlbum() + "\t");
            line.add(ib.getSrc() + "\t");
            csvList.add(line);
        }
        csvUtil.writeCsv("C:/Workspace/WebProject/05. JAVA/lesson/src/extra_crawiling/sec04_csv/melon.csv", csvList, "\t");
    }
}
