package BankSystem;

import java.util.ArrayList;
import java.util.List;

public class Administrator extends Person {

	private 	BankClientDictionarySingleton  verifiedAccounts;
	private List<Integer> waitingAccounts;
	
	public Administrator(String Name) {
		super(Name);
		verifiedAccounts = BankClientDictionarySingleton.get();
		waitingAccounts = new ArrayList<Integer>();
	}

	public List<Integer> getWaitingAccounts() {
		return waitingAccounts;
	}
	
	public BankClientDictionarySingleton getVerifiedAccounts() {
		return verifiedAccounts;
	}

	
}