package BankSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BookAppointment {


	Scanner sc = new Scanner(System.in);
	
	public void bookApp(Client cl) throws ParseException
	{
	
		System.out.println("Provide appointment data:");
		String date = sc.nextLine();
				
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
		
		Appointment app = new Appointment(date2, null, cl); 
		
		System.out.println("Appointment date " + app.getAppDate() + ", scheduled: true");
		System.out.println(cl.getBankAccountDetails());
		
	}
}