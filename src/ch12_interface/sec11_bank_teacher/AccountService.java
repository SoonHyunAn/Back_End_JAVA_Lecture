package ch12_interface.sec11_bank_teacher;

public interface AccountService {
	int DELETED = 1; // public static final 생략
	
	void createAccount(); // public abstract 생략
	
	void accountList();
	
	void deposit();
	
	void withdraw();
	
	void delete();
	
	Account findAccount(String ano);
	
}