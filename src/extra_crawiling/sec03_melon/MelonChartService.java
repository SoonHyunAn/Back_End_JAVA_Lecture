package extra_crawiling.sec03_melon;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MelonChartService {
    public List<MelonChart> getMelon() throws IOException {
        String url = "https://www.melon.com/chart/index.htm";
        Document doc = Jsoup.connect(url).get();

        List<MelonChart> list = new ArrayList<>();
        Elements trs = doc.select("div > table > tbody > tr");
        System.out.println(trs.size());
        for (int i = 0; i < 100; i++) {
            Element tr = trs.get(i);
            String rank_ = tr.selectFirst(".rank").text().strip();
            int rank = Integer.parseInt(rank_);
            String title = tr.selectFirst(".ellipsis.rank01 > span > a").text().strip();
            String artist = tr.selectFirst(".ellipsis.rank02 > a").text().strip();
            String album = tr.selectFirst(".ellipsis.rank03 > a").text().strip();
            String src = tr.selectFirst("td:nth-child(4) > div > a > img").attr("src");
            list.add(new MelonChart(rank, title, artist, album, src));
        }
        return list;
    }
}
