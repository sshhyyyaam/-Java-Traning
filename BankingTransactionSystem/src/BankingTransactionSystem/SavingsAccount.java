package BankingTransactionSystem;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(double initialBalance, double interestRate) {
		super(initialBalance);
		this.interestRate = interestRate;
	}
	
	@Override
	public void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficient funds");
		}
	}
	
	@Override
	public double getBalance() {
		return balance + (balance * interestRate);
	}

 
}
