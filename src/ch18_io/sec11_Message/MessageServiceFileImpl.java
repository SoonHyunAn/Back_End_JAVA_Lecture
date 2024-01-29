package ch18_io.sec11_Message;

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageServiceFileImpl implements MessageService {
    private List<Message> list = new ArrayList<>();
    private int index = 101;
    private final String saveFilename = "C:/temp/message.ser";
    private final Scanner sc = new Scanner(System.in);
    private final LocalDateTime t = LocalDateTime.now();
    public MessageServiceFileImpl() {
        File saveFile = new File(saveFilename);
        if (saveFile.exists()) {
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(saveFile));
                list = (List<Message>) ois.readObject();
                index += list.size();
                Message msg = list.getLast();
                index = msg.getMid() + 1;
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            list.add(new Message(index++, "자바 세계에 오신걸 환영합니다.", "제임스", LocalDateTime.now(), 0));
            list.add(new Message(index++, "안녕하세요? 반갑습니다.", "마리아", LocalDateTime.now(), 0));
            list.add(new Message(index++, "좋은 하루 되세요.", "브라이언", LocalDateTime.now(), 0));
            list.add(new Message(index++, "휴먼교육센터에서 강의를 들어보세요.", "엠마", LocalDateTime.now(), 0));
            list.add(new Message(index++, "스프링부트도 함께 배워요.", "제임스", LocalDateTime.now(), 0));
        }

    }

    @Override
    public Message findByMid(int mid) {
        for (Message m : list) {
            if (m.getMid() == mid) {
                return m;
            }
        }
        return null;
    }

    @Override
    public List<Message> getMessageListAll() {
        for (Message m : list) {
            if (m.getIsDeleted() == MessageService.DELETED) {
                continue;
            } else {
                System.out.println(m.getMid() + " " + m.getContent() + " " + m.getWriter() + " " + m.getModTime());
            }
        }
        return null;
    }

    @Override
    public List<Message> getMessageListByWriter(String writer) {
        for (Message m : list) {
            if (m.getIsDeleted() != MessageService.DELETED && m.getWriter().equals(writer)) {
                System.out.println(m.getMid() + " " + m.getContent() + " " + m.getWriter() + " " + m.getModTime());
            }
        }
        return null;
    }

    @Override
    public void insertMessage(Message message) {
        message.setMid(index++);
        message.setModTime(t);
        message.setIsDeleted(0);
        list.add(message);
        System.out.println("게시글이 작성 되었습니다.");
    }

    @Override
    public void updateMessage(Message message) {
        for (Message m : list) {
            if (m.getIsDeleted() != MessageService.DELETED && m.getMid() == message.getMid()) {
                System.out.print("수정할 이름 입력(기존 이름:" + m.getWriter() + ")> ");
                String uName = sc.nextLine();
                m.setWriter(uName);
                System.out.print("수정할 내용 입력(기존 내용:" + m.getContent() + ")> ");
                String uContent = sc.nextLine();
                m.setContent(uContent);

                System.out.println("게시글이 수정 되었습니다.");
                break;
            }
        }
    }

    @Override
    public void deleteMessage(int mid) {
        for (Message m : list) {
            if (m.getMid() == mid) {
                list.remove(m);
                break;
            }
        }
    }

    @Override
    public void close() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(saveFilename));
            oos.writeObject(list);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
