package ch09_Modifier.sec11_account;

public class Account {
	private int balance;
	public static final int MIN_BALNACE = 0;
	public static final int MAX_BALNACE = 1000000;

	public int getBalace() {
		return balance;
	}

	public void setBalace(int balance) {
//		if (balance <= MIN_BALNACE || balance >= MAX_BALNACE)
//			return;
//		this.balance += balance;
		if (balance >= MIN_BALNACE && balance <= MAX_BALNACE)
			this.balance += balance;
	}

}
