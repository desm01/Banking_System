package BankSystem;


import java.util.Scanner;

public class BankClientCredentials {
	
	private BankClientDictionarySingleton CL;
	private Scanner inputlg = new Scanner(System.in);
	
	public BankClientCredentials(BankClientDictionarySingleton clientList)
	{
		this.CL = clientList;
	}
	
	public BankClientDictionarySingleton getList()
	{
		return this.CL;
	}
	
	public int ActiveLogin()
	{
		String username = "";
		String password = "";
		
		System.out.println("\nProvide username: ");
		username = inputlg.next();
		System.out.println("\nProvide passowrd: ");
		password = inputlg.next();
		
		if (username.startsWith("$")) {
			System.out.println("Error, invalid character in username");
		}
		
		if (password.endsWith(".")) {
			System.out.println("Error, invalid character in password");
		}
		else {
			Client c = CL.get(CL.searchClient(username, password));
			
		{
			if(username.equals(c.getUserName()) && password.equals(c.getPassword()))
			{
				System.out.println(c.getClientDetails());
				return c.getId();
				
				
			}
		}
		}
		return 0;
		
	}
}
