package BankSystem;


import java.util.Scanner;

public class RegisterAccount {
	private static  String addAccount = "";
	
	private static  Scanner input = new Scanner(System.in);
	
	public static  void getInput() {
		System.out.println("\n0. NO extra account");
		System.out.println("1. Extra account");
	
	addAccount = input.nextLine();
	}
	
public static void makeAccount(BankClientDictionarySingleton clientList, int clientID) {
		
		do {
		
		System.out.println("\nProvide account type (primary, savings):");
	

		String userChoice = input.nextLine();
		userChoice.toLowerCase();		

		//System.out.println("\nHow much money do you want to put in the account?");
		double amount = 100;
		
		
		
	    int size = clientList.size();
		double accountNumber = clientList.get(size-1).getLastId() + 1;
	    
		System.out.println("\nAccount number " + accountNumber + ", verified: true");
		
		if (userChoice.equals("primary")) {
		BankAccount account = new PrimaryAccount(amount, clientList.get(clientID-1) );
		clientList.get(clientID -1).addPrimaryAccount(account);
		
		}
		
		else if (userChoice.equals("savings")) {
			BankAccount account = new SavingAccount (amount, clientList.get(clientID-1));
			clientList.get(clientID -1).addSaveAccount(account);
		}
		
		else {
			
		}
		getInput();
	}
		while (addAccount.contentEquals("1"));
	}
	
}
//static
