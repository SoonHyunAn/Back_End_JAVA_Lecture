package extra_crawiling.sec03_melon;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MelonChart {
    private int rank;
    private String title;
    private String artist;
    private String album;
    private String src;

    public MelonChart(int rank, String title, String artist, String album, String src) {
        this.rank = rank;
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.src = src;
    }

    @Override
    public String toString() {
        return String.format("%2d %s | %s | %s | %s", rank, title, artist, album, src);
    }


    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
