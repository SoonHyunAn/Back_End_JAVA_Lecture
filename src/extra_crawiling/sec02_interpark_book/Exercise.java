package extra_crawiling.sec02_interpark_book;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Objects;

public class Exercise {
    public static void main(String[] args) throws IOException {
        String url = "https://book.interpark.com/display/collectlist.do?_method=bestsellerHourNew&bookblockname=b_gnb&booklinkname=%BA%A3%BD%BA%C6%AE%C1%B8&bid1=w_bgnb&bid2=LiveRanking&bid3=main&bid4=001&utm_source=google&utm_medium=cpc&utm_campaign=book_brand_20210617_pc_cpc_paidsearch&utm_content=consider_34&utm_term=%EB%B2%A0%EC%8A%A4%ED%8A%B8%EC%85%80%EB%9F%AC_sub3&utm_term=%EC%9D%B8%ED%84%B0%ED%8C%8C%ED%81%AC%EB%8F%84%EC%84%9C&gclid=Cj0KCQiAqsitBhDlARIsAGMR1Rgu9cq4Eyufpht_42yEmGlZoOuhcbPKFp3Es5SrwRIOO_St23UK-SAaAmXoEALw_wcB";
        Document doc = Jsoup.connect(url).get();

        Elements lis = doc.select(".rankBestContentList > ol > li");
        System.out.println(lis.size());

        Element li = lis.get(14);
        String title = Objects.requireNonNull(li.selectFirst(".itemName")).text().strip();
        String author = Objects.requireNonNull(li.selectFirst(".author")).text().strip();
        String company = Objects.requireNonNull(li.selectFirst(".company")).text().strip();
        String price_ = Objects.requireNonNull(li.selectFirst(".price > em")).text().strip();
        int price = Integer.parseInt(price_.replace(",", ""));
        System.out.println(title + ", " + author + ", " + company + ", " + price);

        Elements spans = li.select(".rankNumber.digit2 > span");
        String rank_ = "";
        for (Element span : spans) {
            String s = span.attr("class").strip();
            rank_ += s.charAt(s.length() - 1);
        }
        int rank = Integer.parseInt(rank_);
        System.out.println(rank);
    }
}
