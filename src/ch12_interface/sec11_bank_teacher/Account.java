package ch12_interface.sec11_bank_teacher;

public class Account {
	private String ano; // 제로값으로 초기화됨
	private String owner;
	private int balance;
	private int isDeleted; // CRUD 기준에서 D 단계

	public Account() {
	}

	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public Account(String ano, String owner, int balance, int isDeleted) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		this.isDeleted = isDeleted;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}


	public String tostring(Account account) {
		return "Account [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}

}