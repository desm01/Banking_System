package BankSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public abstract class TransactionTemplate {
	
	private Scanner scan = new Scanner(System.in);
	SimpleDateFormat myFormatObj = new SimpleDateFormat("dd/MM/yyyy");

	final Client ClientCreator(Client BC1)
	{
		Client c;
		if (PassedObj())
		{
			c = BC1;
		}
		
		else
		{
			c = new Client();
			c.addID();
		}
			
		System.out.println("Provide username:");
		String newUsername = scan.nextLine();
		
		System.out.println("Provide password:");
		String newPassword = scan.nextLine();
		
		System.out.println("Provide name:");
		String newName = scan.nextLine();
		
		System.out.println("Provide address:");
		String newAddress = scan.nextLine();
		
		System.out.println("Provide birthDate (dd/MM/yyyy):");
		String birthDate = scan.nextLine();
		
		try {
			myFormatObj.parse(birthDate);
		}
		catch (ParseException pe) {
			errorMessage();
			return BC1;
		}
		
		if(newUsername.trim().equals("") || newPassword.trim().equals("") || newName.trim().equals("") || newAddress.trim().equals("") || birthDate.trim().equals(""))
		{
			errorMessage();
			return BC1;
		}

		else {
			//c.addID();
			c.changeDetails(3, birthDate);
			c.changeDetails(2,newAddress);
			c.changeDetails(1,newName);
			c.changeDetails(5,newPassword);
			c.changeDetails(4,newUsername);
			return c;
		}
		
		//return c;
	}
	
	void errorMessage() {
		// TODO Auto-generated method stub
		
	}
	
	boolean PassedObj() {return true;}
}

//create null constuctor
//create client object
//pass client object
//check values
//error message
//complete edit
//bank account details output
//bank account no.
//BankClientProfile
//ChangeDetails