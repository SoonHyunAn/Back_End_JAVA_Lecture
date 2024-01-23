package ch12_interface.sec11_bank1;

import java.util.Scanner;

public class AccountServiceImpl implements AccountService {
	Scanner scan = new Scanner(System.in);

	@Override
	public void createAccount(Account[] accountArray) {
		System.out.println("----------");
		System.out.println("계좌 생성");
		System.out.println("----------");

		System.out.println("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("계좌주 이름> ");
		String owner = scan.nextLine();
		System.out.print("최초 입금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = new Account(ano, owner, balance);
				break;
			}
		}
		System.out.println("계좌가 생성되었습니다.");
	}

	@Override
	public void accountList(Account[] accountArray) {
		System.out.println("----------");
		System.out.println("계좌 목록");
		System.out.println("----------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				Account acc = accountArray[i];
				System.out.printf("%s %-6s\t %,10d\n", acc.getAno(), acc.getOwner(), acc.getBalance());
				continue;
			}
			break;
		}

	}

	@Override
	public void deposit(Account[] accountArray) {
		System.out.println("----------");
		System.out.println("---예금---");
		System.out.println("----------");

		System.out.println("계좌 번호> ");
		String ano = scan.nextLine();
		Account account = findAccount(ano, accountArray);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		System.out.print("예금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		account.setBalance(balance + account.getBalance());
		System.out.println("예금 완료");
	}

	@Override
	public void withdraw(Account[] accountArray) {
		System.out.println("----------");
		System.out.println("---출금---");
		System.out.println("----------");

		System.out.println("계좌 번호> ");
		String ano = scan.nextLine();
		System.out.print("출금액> ");
		int balance = Integer.parseInt(scan.nextLine());
		Account account = findAccount(ano, accountArray);
		if (account == null) {
			System.out.println("계좌번호를 확인하세요.");
			return;
		}
		if (account.getBalance() >= balance) {
			account.setBalance(account.getBalance() - balance);
			System.out.println("출금이 완료되었습니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	@Override
	public Account findAccount(String ano, Account[] accountArray) {
		for (Account acc : accountArray) {
			if (acc == null)
				return null;
			if ((ano.equals(acc.getAno())))
				return acc;
		}
		return null;
	}

}
