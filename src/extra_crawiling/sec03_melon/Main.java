package extra_crawiling.sec03_melon;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {


        MelonChartService melonChartService = new MelonChartService();
        List<MelonChart> list = melonChartService.getMelon();
        for (MelonChart x : list) {
            System.out.println(x);
        }
    }
}
