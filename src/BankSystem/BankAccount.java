package BankSystem;

public abstract class BankAccount {
	
	private int bankAccountNumber;
	private double bankAccountBalance;
	private String bankAccountType;
	private Client cl;
	private static int idCounter = 1;

	public BankAccount(double BankAccountBalance, Client CL, String BankAccountType) {
		bankAccountNumber = idCounter++;
		bankAccountBalance = BankAccountBalance;
		cl = CL;
		bankAccountType = BankAccountType;
	}
	
	public String getBankAccountType() {
		return bankAccountType;
	}
	
	public Client getCl() {
		return cl;
	}

	public void setCl(Client cl) {
		this.cl = cl;
	}
	
	public void addAmount(double amount) {
		bankAccountBalance += amount;
	}
	
	public void subtractAmount(double amount) {
		bankAccountBalance -= amount;
	}

	public int getBankAccountNumber() {
		return bankAccountNumber;
	}

//	public void setBankAccountNumber(double bankAccountNumber) {
//		this.bankAccountNumber = bankAccountNumber;
//	}

	public void setBankAccountNumber(int zero) {
		this.bankAccountNumber = zero;
	}
	
	public double getBankAccountBalance() {
		return bankAccountBalance;
	}

	public void setBankAccountBalance(double bankAccountBalance) {
		this.bankAccountBalance = bankAccountBalance;
	}
	
	public String getAccountDetails() {
		
		if (getBankAccountNumber() == 0) {
			return "";
		}
		else {
		String details = "";
		details += "Account Number = " + getBankAccountNumber() + ", accountType = " + getBankAccountType() ;
		return details;
		}
	}
	
	public String toString()
	{
		if (getBankAccountNumber() == 0) {
			return "";
		}
		
		String details = ""; 
		details += "\naccountType: " + getBankAccountType() + "\n";
		details += "accountNumber = " + getBankAccountNumber();
		details += " accountVerified = true";
		details += " accountBalance = " + getBankAccountBalance() + "\n";
		return details;
	}
}
