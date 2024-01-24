package ch17_collection.part1_list.sec03_MessageArray;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageServiceListImpl implements MessageService {
	private List<Message> messageList = new ArrayList<Message>();
	private Scanner sc = new Scanner(System.in);
	private LocalDateTime t = LocalDateTime.now();

	public MessageServiceListImpl() {
		messageList.add(new Message(101, "자바 세계에 오신걸 환영합니다.", "제임스", LocalDateTime.now(), 0));
		messageList.add(new Message(102, "안녕하세요? 반갑습니다.", "마리아", LocalDateTime.now(), 0));
		messageList.add(new Message(103, "좋은 하루 되세요.", "브라이언", LocalDateTime.now(), 0));
		messageList.add(new Message(104, "휴먼교육센터에서 강의를 들어보세요.", "엠마", LocalDateTime.now(), 0));
		messageList.add(new Message(105, "스프링부트도 함께 배워요.", "제임스", LocalDateTime.now(), 0));
	}

	@Override
	public Message findByMid(int mid) {
		for (Message m : messageList) {
			if (m.getMid() == mid) {
				return m;
			}
		}
		return null;
	}

	@Override
	public List<Message> getMessageListAll() {
		for (Message m : messageList) {
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
		for (Message m : messageList) {
			if (m.getIsDeleted() == MessageService.DELETED) {
				continue;
			} else if (m.getWriter().equals(writer)) {
				System.out.println(m.getMid() + " " + m.getContent() + " " + m.getWriter() + " " + m.getModTime());
			}
		}
		return null;
	}

	@Override
	public void insertMessage(Message message) {
		message.setMid(100 + messageList.size() + 1);
		message.setModTime(t);
		message.setIsDeleted(0);
		messageList.add(message);
		System.out.println("게시글이 작성 되었습니다.");
	}

	@Override
	public void updateMessage(Message message) {
		for (Message m : messageList) {
			if (m.getIsDeleted() == MessageService.DELETED) {
				continue;
			}
			if (m.getMid() == message.getMid()) {
				System.out.print("수정할 이름 입력> ");
				String uName = sc.nextLine();
				m.setWriter(uName);
				System.out.print("수정할 내용 입력> ");
				String uContent = sc.nextLine();
				m.setContent(uContent);

				System.out.println("게시글이 수정 되었습니다.");
				break;
			}
		}
	}

	@Override
	public void deleteMessage(int mid) {
		for (Message m : messageList) {
			if (m.getMid() == mid) {
				messageList.remove(m);
				break;
			}
		}
	}

}