package BankingTransactionSystem;

public class Bank {

	private static int totalAccounts = 0;
	
	public static int getTotalAccuonts() {
		return totalAccounts;
	}
	
	public static void incrementTotalAccounts() {
		totalAccounts++;
	}
}
