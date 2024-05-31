package BankingTransactionSystem;

public class Main {
	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(1000, 0.05);
		CheckingAccount checking = new CheckingAccount(500, 200);
		
		System.out.println("Total accounts: " + Bank.getTotalAccuonts());
		
		Transaction transaction = new Transaction();
		transaction.performTransaction(savings, 200, "deposit");
		savings.printBalance();
		
		
		transaction.performTransaction(checking, 100, "withdraw");
		checking.printBalance();
		
		System.out.println("Total accounts: " + Bank.getTotalAccuonts());
	}

}
