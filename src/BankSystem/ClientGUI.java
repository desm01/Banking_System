 package BankSystem;


import java.text.ParseException;


public class ClientGUI {

	private static BankClientDictionarySingleton ClientList =  BankClientDictionarySingleton.get();
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		while(true) {	
			int input = 0;
			String[] firstM = {"Exit","Register","Login"};
			GUI start = new GUI("Welcome.", firstM, "register");
			String[] lgnM = {"Exit","Change Bank Client Details", "Delete Bank Account", "Money Transfer", "Book appointment"};
			GUI lgnScr = new GUI("Login Menu", lgnM, "login");
			
			start.display();
			input = start.getChoice();
			
			if(input == 0)
			{
				break;
			}
			if(input == 1)
			{
				Client tempClient = new Client();
				BankClientProfile bcp = new BankClientProfile();
				Client BC1 = bcp.ClientCreator(tempClient);
				if(BC1 != tempClient)
				{
					ClientList.addBankClient(BC1);
					RegisterAccount.makeAccount(ClientList, BC1.getId());
					System.out.println(BC1.getClientDetails());
					System.out.println(BC1.getBankAccountDetails());
				}
			}
			if(input == 4)
			{
				int clientID;
				//Login class is created and called
				BankClientCredentials lg = new BankClientCredentials(ClientList);
				try {
				clientID = lg.ActiveLogin();
				}
				
				catch (ArrayIndexOutOfBoundsException ex) {
					clientID = 0;
				}
				
				if (clientID == 0)
				{
					System.out.println("Bank credentials were not found.");
					System.out.println(ClientList.get(clientID).getClientDetails());
					System.out.println(ClientList.get(clientID).getBankAccountDetails());
				}
				else
				{
					while(true)
					{
						
						lgnScr.display();
						input = lgnScr.getChoice();
						
						
						
						if(input == 5)
						{
							ChangeDetails cd = new ChangeDetails();
							cd.ClientCreator(ClientList.get(clientID -1));
							System.out.println(ClientList.get(clientID - 1).getClientDetails());
							System.out.println(ClientList.get(clientID -1).getBankAccountDetails());
							
						}
						if(input == 6)
						{
						
						DeleteAccount.deleteAccount(ClientList.get(clientID - 1).getBankAccounts());
						System.out.println(ClientList.get(clientID - 1).getClientDetails());
						System.out.println(ClientList.get(clientID - 1).getBankAccountDetails());
						}
						if (input == 7)
						{
							MoneyTransfer.transfer(ClientList.get(clientID - 1));
							System.out.println(ClientList.get(clientID - 1).getClientDetails());
							System.out.println(ClientList.get(clientID - 1).getBankAccountDetails());
						}
						if (input == 8)
						{
							BookAppointment ba1 = new BookAppointment();
							ba1.bookApp(ClientList.get(clientID - 1));
						}
						
						
						
						if(input == 0)
						{
							break;
						}
						else
						{
							
						}
					}
				}
			}
			else 
			{
			
			}
		}
	}

}
