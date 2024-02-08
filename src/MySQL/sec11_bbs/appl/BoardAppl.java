package MySQL.sec11_bbs.appl;

import MySQL.sec11_bbs.entity.Board;
import MySQL.sec11_bbs.service.BoardService;
import MySQL.sec11_bbs.service.BoardServiceMySQLImpl;

import java.util.List;

public class BoardAppl {
    public static void main(String[] arge){
        BoardService bSvc = new BoardServiceMySQLImpl();
        List<Board> list = bSvc.getBoardList(1,null,null); // (1, "", "") 도 가능
        list.forEach(x-> System.out.println(x.listForm()));
        System.out.println("========================================");

        Board board = bSvc.getBoard(14);
        System.out.println(board);
        if (board.getReplyList() != null)
            board.getReplyList().forEach(x-> System.out.println(x));

        bSvc.close();
    }
}
