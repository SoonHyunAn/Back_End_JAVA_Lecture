package MySQL.sec11_bbs.dao;

import MySQL.sec11_bbs.dao.BoardDao;
import MySQL.sec11_bbs.entity.Board;

import java.util.List;

public class BoardDaoTest {
    public static void main(String[] args) {
        BoardDao bDao = new BoardDao();

        // bid로 select, viewCount 하나 증가
        String sessionUid = "james"; // 제임스가 로그인한 것으로 가정
        Board b = bDao.getBoard(12);
        if (!b.getUid().equals(sessionUid))
            bDao.increaseCount("view", 12); // 자기 자신의 글을 볼때가 아닐때만 하나씩 증가시킴
        System.out.println(b);

        // insert
//        b = new Board("제목 2", "본문 2", "james");
//        bDao.insertBoard(b);
//        b = new Board("제목 3", "본문 3", "james");
//        bDao.insertBoard(b);
//        b = new Board("제목 4", "본문 4", "maria");
//        bDao.insertBoard(b);
//        b = new Board("제목 5", "본문 5", "sarah");
//        bDao.insertBoard(b);
//        b = new Board("제목 6", "본문 6", "brian");
//        bDao.insertBoard(b);
//        b = new Board("제목 7", "본문 7", "james");
//        bDao.insertBoard(b);
//        b = new Board("제목 8", "본문 8", "james");
//        bDao.insertBoard(b);
//        b = new Board("제목 9", "본문 9", "maria");
//        bDao.insertBoard(b);
//        b = new Board("제목 10", "본문 10", "sarah");
//        bDao.insertBoard(b);
//        b = new Board("제목 11", "본문 11", "brian");
//        bDao.insertBoard(b);
//        b = new Board("제목 12", "본문 12", "james");
//        bDao.insertBoard(b);
//        b = new Board("제목 13", "본문 13", "james");
//        bDao.insertBoard(b);
//        b = new Board("제목 14", "본문 14", "maria");
//        bDao.insertBoard(b);
//        b = new Board("제목 15", "본문 15", "sarah");
//        bDao.insertBoard(b);
//        b = new Board("제목 16", "본문 16", "brian");
//        bDao.insertBoard(b);

        // 전체 확인
        List<Board> list = bDao.getBoardList("title", "%", 10, 0);
        list.forEach(x -> System.out.println(x.listForm()));
        System.out.println();

//        list = bDao.getBoardList("b.uid", "james", 10, 0);
//        list.forEach(x -> System.out.println(x.listForm()));
//        System.out.println();
//
//        list = bDao.getBoardList("uname", "마리아", 10, 0);
//        list.forEach(x -> System.out.println(x.listForm()));



        bDao.close();

    }
}
