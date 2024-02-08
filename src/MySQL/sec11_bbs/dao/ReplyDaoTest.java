package MySQL.sec11_bbs.dao;


import MySQL.sec11_bbs.dao.BoardDao;
import MySQL.sec11_bbs.dao.ReplyDao;
import MySQL.sec11_bbs.entity.Reply;

import java.util.List;

public class ReplyDaoTest {

    public static void main(String[] args) {
        ReplyDao rDao = new ReplyDao();
        BoardDao bDao = new BoardDao();
        Reply r = new Reply();
        String sessionUid = "maria";
        int bid = 12;

        r.setComment("댓글 2");
        r.setUid(sessionUid);
        r.setBid(bid);
        rDao.insertReply(r);
        bDao.increaseCount("reply", bid);

        List<Reply> list = rDao.getReplyList(bid);
        list.forEach(x -> System.out.println(x));

        bDao.close();
        rDao.close();


    }

}