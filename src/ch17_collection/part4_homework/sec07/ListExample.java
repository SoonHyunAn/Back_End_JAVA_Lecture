package ch17_collection.part4_homework.sec07;

import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		boardDao dao = new boardDao();
		List<Board> list = dao.getBoardList();
		for (Board board : list)
			System.out.println(board.getTitle() + "-" + board.getContent());
	}

}
