package Entities;

public class Account {

	private int accountNumber;
	private String accountHolder;
	private double balance;
	private double tax = 5.00;

	// getters and setters
	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// constructors
	public Account(int accountNumber, String accountHolder) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
	}

	public Account(int accountNumber, double initialBalance, String accountHolder) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		deposit(initialBalance);
	}

	// mains methods
	public void deposit(double value) {
		this.balance += value;
	}

	public void withdraw(double value) {
		this.balance -= (value + tax);
	}
	
	public String toString() {
		return "Account Number : " 
				+ accountNumber 
				+ ", Holder : " 
				+ accountHolder
				+ ", Balance $ : "
				+ balance;
	}

}
