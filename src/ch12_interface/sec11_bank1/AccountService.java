package ch12_interface.sec11_bank1;

public interface AccountService {
	void accountList(Account[] accountArray);

	void createAccount(Account[] accountArray);

	void deposit(Account[] accountArray);

	void withdraw(Account[] accountArray);

	Account findAccount(String ano, Account[] accountArray);

}
