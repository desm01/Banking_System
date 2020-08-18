package BankSystem;



public class BankClientProfile extends TransactionTemplate {
	
	void errorMessage() {
		System.out.println("You have entered invalid details to create bank account");	
	}
	
	boolean PassedObj() {return false;}
}
