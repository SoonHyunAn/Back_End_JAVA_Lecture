package ch09_Modifier.sec11_account;

public class AccountMain {

	public static void main(String[] args) {
		Account account = new Account();

		account.setBalace(10000);
		System.out.println("현재 잔고: " + account.getBalace());

		account.setBalace(-100); // 범위 밖
		System.out.println("현재 잔고: " + account.getBalace());

		account.setBalace(2000000);// 범위 밖
		System.out.println("현재 잔고: " + account.getBalace());

		account.setBalace(300000);
		System.out.println("현재 잔고: " + account.getBalace());
	}

}
