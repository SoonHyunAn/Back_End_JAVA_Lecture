package ch12_interface.sec11_bank_teacher;

public interface AccountService {
	
	void createAccount();
	
	void accountList();
	
	void deposit();
	
	void withdraw();
	
	Account findAccount(String ano);
	
}