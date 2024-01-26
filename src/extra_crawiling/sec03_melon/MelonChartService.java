package extra_crawiling.sec03_melon;

import ch12_interface.sec05_default.A;
import extra_crawiling.sec02_interpark_book.InterparkBook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MelonChartService {
    public List<MelonChart> getMelon() throws IOException {
        String url = "https://book.interpark.com/display/collectlist.do?_method=bestsellerHourNew&bookblockname=b_gnb&booklinkname=%BA%A3%BD%BA%C6%AE%C1%B8&bid1=w_bgnb&bid2=LiveRanking&bid3=main&bid4=001&utm_source=google&utm_medium=cpc&utm_campaign=book_brand_20210617_pc_cpc_paidsearch&utm_content=consider_34&utm_term=%EB%B2%A0%EC%8A%A4%ED%8A%B8%EC%85%80%EB%9F%AC_sub3&utm_term=%EC%9D%B8%ED%84%B0%ED%8C%8C%ED%81%AC%EB%8F%84%EC%84%9C&gclid=Cj0KCQiAqsitBhDlARIsAGMR1Rgu9cq4Eyufpht_42yEmGlZoOuhcbPKFp3Es5SrwRIOO_St23UK-SAaAmXoEALw_wcB";
        Document doc = Jsoup.connect(url).get();
        Elements lis = doc.select(".rankBestContentList > ol > li");

        List<MelonChart> list = new ArrayList<>();
        for (Element li : lis) {
            Elements spans = li.select(".rankNumber.digit2 > span");
            Elements trs = doc.select(".service_list_song.type02.d_song_list > table > tbody > tr");
            System.out.println(trs.size());
            for (int i = 0; i < 100; i++) {
                Element tr = trs.get(i);
                int rank = Integer.parseInt(tr.selectFirst(".wrap.t_center > .rank").text().strip());
                String title = tr.selectFirst(".ellipsis.rank01 > span > a").text().strip();
                String artist = tr.selectFirst(".ellipsis.rank02 > a").text().strip();
                String album = tr.selectFirst(".ellipsis.rank03 > a").text().strip();
                String src = tr.selectFirst("td:nth-child(4) > div > a > img").attr("src");
                System.out.println(rank + ", " + title + ", " + artist + ", " + album + ", " + src);
            }
        }
        return list;
    }
}
