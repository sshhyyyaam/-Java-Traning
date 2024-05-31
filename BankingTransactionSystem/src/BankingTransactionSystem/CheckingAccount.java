package BankingTransactionSystem;

public class CheckingAccount extends Account {
	
	private double overdraftLimit;
	
	public CheckingAccount(double initialBalance, double overdraftLimit) {
		super(initialBalance);
		this.overdraftLimit = overdraftLimit;
		
	}
	
	@Override
	public void deposit(double amount) {
		balance += amount;
	}
	
	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
		} else {
			System.out.println("Insufficiant funds");
		}
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

}
