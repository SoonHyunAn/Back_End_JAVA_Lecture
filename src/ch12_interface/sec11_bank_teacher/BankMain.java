package ch12_interface.sec11_bank_teacher;

import java.util.Scanner;

public class BankMain {
	private static Scanner scan = new Scanner(System.in);
	private static AccountService accountService = new AccountServiceArrayImpl();

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("+============+============+========+=========+=========+=========+");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 | 5. 삭제 | 5.종료  |");
			System.out.println("+============+============+========+=========+=========+=========+");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scan.nextLine());
			switch(selectNo) {
			case 1:
				accountService.createAccount(); break;
			case 2:
				accountService.accountList(); break;
			case 3:
				accountService.deposit(); break;
			case 4:
				accountService.withdraw(); break;
			case 5:
				accountService.delete(); break;
			case 6:
				run = false; break;
			default:
				System.out.println("Warning: 1 ~ 6 사이의 숫자만 입력하세요.");
			}
		}
		System.out.println("프로그램 종료");
	}

}