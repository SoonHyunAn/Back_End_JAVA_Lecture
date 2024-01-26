package ch17_collection.part4_homework.sec07;

public class Board {
	private String title;
	private String content;

	public Board(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	public Board(){}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
}