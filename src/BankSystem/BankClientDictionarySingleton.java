package BankSystem;

import java.util.ArrayList;


public class BankClientDictionarySingleton {

	public static BankClientDictionarySingleton BCDS;
	
	private ArrayList<Client> Clients =new ArrayList<Client>();
	
	
	private BankClientDictionarySingleton() {
		
	}
	
	/**
	 * This method only allows one instance of this class to be made
	 * @return
	 */
	public static BankClientDictionarySingleton get () {
		if (BCDS == null) {
		BCDS = new BankClientDictionarySingleton ();
	}
		return BCDS;
	}

	public void addBankClient(Client Client) {
		Clients.add(Client);
	}

	public void printBankClients() {
		for (int x = 0; x < Clients.size() - 1; x++) {
			System.out.println(Clients.get(x).getClientDetails());
		}
	}

	public int searchClient(String username, String password) {
		int y = -1;
		for (int x = 0; x < Clients.size(); x++) {
			if (Clients.get(x).getUserName().equals(username) && Clients.get(x).getPassword().equals(password)) {
				y = Clients.get(x).getId();
			}
		}

		return y-1;
	}

	public int size() {
		int x = Clients.size();
		return x;
	}

	public Client get(int position) {
		// position of the BankClient object in the list of BankClient objects
		Client x = Clients.get(position);

		return x;
	}

	public void delete(int ID) {
		Clients.remove(ID);
	}

}
