//1) Melon chart에서
//1위 ~ 5위 까지를 배열로 만들어 넣고 출력해 볼 것

package ch06_class.sec05_melon;

public class melonChart {
	private int rank;
	private String title;
	private String artist;
	private String album;
	private int like;

	public melonChart(int rank, String title, String artist, String album, int like) {
		this.rank = rank;
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.like = like;
	}

	@Override
	public String toString() {
		return "melon [rank=" + rank + ", title=" + title + ", artist=" + artist + ", album=" + album + ", like=" + like
				+ "]";
	}
}