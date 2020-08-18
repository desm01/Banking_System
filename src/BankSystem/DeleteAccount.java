package BankSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAccount {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static void deleteAccount (ArrayList<BankAccount> accountList ){
		
		
		for (BankAccount bank : accountList) {
			if (bank.getBankAccountNumber() == 0) {
				
			}
			else {
			
			System.out.println("\naccountNumber: " + bank.getBankAccountNumber() + ", accountVerified = true" + "accountBalance: " + bank.getBankAccountBalance());
			
		}
		}
		System.out.println("Provide account number:");
		double choice = scan.nextDouble();
		
		for ( BankAccount bank : accountList) {
			if (bank.getBankAccountNumber() == choice) {
				bank.setBankAccountNumber(0);
			}
		} 
		
		
	}
}