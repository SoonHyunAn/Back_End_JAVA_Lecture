package ch17_collection.part1_list.sec03_MessageArray;

import java.util.Scanner;

public class MessageMain {
	private static MessageService messageService = new MessageServiceImpl();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		while (run) {
			int index = 0;
			String writer = "";
			System.out.println(
					"+============++============++============++============++=================++============+");
			System.out.println("| 1.게시물 목록 | 2.작가 검색 | 3.게시글 작성 | 4. 게시글 수정 | 5.게시글 삭제 | 6.종료 |");
			System.out.println(
					"+============++============++============++============++=================++============+");
			System.out.print("선택> ");
			int selectNum = Integer.parseInt(sc.nextLine());
			
	}
}
