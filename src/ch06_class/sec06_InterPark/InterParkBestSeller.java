//2) Interpark best seller 도서에서
//1위 ~ 5위 까지를 배열로 만들어 넣고 출력해 볼 것
package ch06_class.sec06_InterPark;

public class InterParkBestSeller {
	private int rank;
	private String title;
	private String author;
	private String translator;
	private String company;
	private int price;

	public InterParkBestSeller() {}
	public InterParkBestSeller(int rank, String title, String author, String translator, String company, int price) {
		this.rank = rank;
		this.title = title;
		this.author = author;
		this.translator = translator;
		this.company = company;
		this.price = price;
	}
	
	public InterParkBestSeller(int rank, String title, String author, String company, int price) {
		this.rank = rank;
		this.title = title;
		this.author = author;
		this.company = company;
		this.price = price;
	}

	@Override
	public String toString() {
		return "InterPark [rank=" + rank + ", title=" + title + ", author=" + author 
				+ ((translator==null)? "": (", translator" + translator))
				+ ", company=" + company + ", price=" + String.format("%,d", price) + "]";
	}

}
