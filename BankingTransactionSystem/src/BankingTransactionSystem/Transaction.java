package BankingTransactionSystem;

public class Transaction {
	
	private final double transactionFee = 5.00;
	
	public final void performTransaction(Account account, double amount, String type) {
		
		if(type.equals("deposit")) {
			account.deposit(amount);
		} else if(type.equals("withdraw")){
			account.withdraw(amount);
		}
		account.withdraw(transactionFee);
		System.out.println("Transaction completed. Transaction Fee: " + transactionFee);
	}
	
	public double getTransactionFee() {
		return transactionFee;
	}

}
