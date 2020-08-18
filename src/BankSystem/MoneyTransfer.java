package BankSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyTransfer {
	
	private static Scanner inp = new Scanner(System.in);
	private static ArrayList <BankAccount> bankAccounts = new ArrayList<BankAccount>();
	
	public static void transfer(Client client) {

		
		
		
		
		bankAccounts = client.getBankAccounts();
		
		for (BankAccount bank : bankAccounts) {
			if (bank.getBankAccountNumber() == 0) {
				
			}
			else {
			System.out.println("\naccount Number = " + bank.getBankAccountNumber() + " accountVerified = true, " + "accountBalance: " + bank.getBankAccountBalance());
			}
		}
		
		System.out.println("\nProvide from account number:");
		double accountFrom = inp.nextDouble();
		
		System.out.println("\n\nProvide to account number:");		
		double accountToTransfer = inp.nextDouble();
		
		System.out.println("\n\nProvide amount:");
		double amount = inp.nextDouble();
			
		for (BankAccount bankToTransferTo : bankAccounts) {
			if (accountToTransfer == bankToTransferTo.getBankAccountNumber()) {
				for (BankAccount bankFrom : bankAccounts) {
					if (accountFrom == bankFrom.getBankAccountNumber()) {
						transferMoney(bankToTransferTo, amount, bankFrom);
					}
				}
			}
		}
			
				
		}

		public static void transferMoney(BankAccount accountToTransfer, double amountToBeTransfered, BankAccount accountToTransferFrom ) {
if (accountToTransfer.getBankAccountBalance() < amountToBeTransfered) {
	System.out.println( "Not enough amount in the source account" );
}
else {
	

			
			accountToTransfer.addAmount(amountToBeTransfered);
			accountToTransferFrom.subtractAmount(amountToBeTransfered);
}
			
		}
}


