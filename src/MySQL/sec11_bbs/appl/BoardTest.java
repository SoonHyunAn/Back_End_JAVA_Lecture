package MySQL.sec11_bbs.appl;

import MySQL.sec11_bbs.dao.BoardDao;
import MySQL.sec11_bbs.entity.Board;

public class BoardTest {
    public static void main(String[] args) {
        BoardDao bDao = new BoardDao();

        Board b = bDao.getBoard(1);
        System.out.println(b);
    }
}
