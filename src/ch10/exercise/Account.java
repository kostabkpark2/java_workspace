package ch10.exercise;

public class Account {
	private String accountNo;
	private String accountOwner;
	private long balance;

	// 생성자
	public Account(String accountNo, String accountOwner, long balance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}

	// 접근자
	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public long getBalance() {
		return balance;
	}
	// 메서드

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s \t %s \t %d", accountNo, accountOwner, balance);
	}
}
