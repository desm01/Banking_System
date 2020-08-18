package BankSystem;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminGUI {
	
	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		Client c1 = new Client("D1","p1","AS1", "23/10/2000" ,"u1");
		Client c2 = new Client("D2","p2","AS2", "10/12/2001" ,"u2");
		//Administrator a1 =new Administrator("Josh Blaggs");
		BankAccount p1 = new PrimaryAccount(100,c1);
		BankAccount s1 = new SavingAccount(101,c2);
		ArrayList<Client> ClientList = new ArrayList<Client>();
		ArrayList<BankAccount> L1 = new ArrayList<BankAccount>();
		
		c1.addPrimaryAccount(p1);
		c2.addSaveAccount(s1);
		
		ClientList.add(c1);
		ClientList.add(c2);
		
		L1.add(p1);
		L1.add(s1);
		
		
		while (true)
		{
			if (L1.size() == 0)
			{
				System.out.println("You have no accounts to verify");
				break;
			}
			else
			{
			
				for (int y = 0; y < ClientList.size(); y ++) {
					System.out.println(ClientList.get(y).getBankAdminDetails());
				}
			
				for(int x = L1.size()-1; x>=0; x--) 
				{
					System.out.println( "Account number = " + L1.get(x).getBankAccountNumber());
					System.out.println("1. Verify the opening");
					System.out.println("2. Do not verify the opening");
					
					System.out.println("Provide choice:");
					String empChoice = input.nextLine();
					empChoice.toLowerCase();
					
					if(empChoice.equals("1"))
					{
						
						System.out.println("Account number " + L1.get(x).getBankAccountNumber() + ", verified = true");
						L1.remove(x);
					}
					else if(empChoice.equals("2") )
					{
						System.out.println("Account number " + L1.get(x).getBankAccountNumber() + ", verified = false");
						L1.remove(x);
						
					}
					else {
						System.out.println("You have entered an invalid choice");
					}
				}
			}
		}
		
	}

}
