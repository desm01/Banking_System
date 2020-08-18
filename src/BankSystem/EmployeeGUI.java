package BankSystem;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class EmployeeGUI{

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Client c1 = new Client("A","p1","a1", "01/01/2000" ,"u1");
		Client c2 = new Client("B","p2","a2", "01/01/2000" ,"u2");
		Employee e1 =new Employee("");
		String dateString1 = "20/12/2000";
		String dateString2 = "22/12/2000";
		
		Date currentDate = new Date();
		
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dateString1);
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(dateString2);
		
		if (date1.after(currentDate) || date2.after(currentDate)) {
			System.out.println("Error, date is after today");
		}
		else {
		
		Appointment app1 = new Appointment(date1 ,e1,c1);
		Appointment app2 = new Appointment(date2 ,e1,c2);
		e1.addAppointment(app1);
		e1.addAppointment(app2);
		
		for (Appointment aptmt : e1.getAppointmentsNotVer()) {
			System.out.println("Appointment date: " + aptmt.getAppDate());
			System.out.println(aptmt.getAppClient().getClientDetailsAppointment());
		
		}
		}
		
	//	System.out.println("Welcome.\nThese are your appointments\nto verify..");
		while (true)
		{
			ArrayList<Appointment> appToVer = e1.getAppointmentsNotVer();
			if (appToVer.size() == 0)
			{
				System.out.println("You have no appointments to verify");
				break;
			}
			else
			{
				for(Appointment apmt : appToVer)
				{
					System.out.println(apmt.toString());
					System.out.println("1. Book it\n2. Do not book it");
					String empChoice = input.nextLine();
					empChoice.toLowerCase();
					
					if(empChoice.equals("1"))
					{
						e1.VerifyApp(apmt);
						System.out.println("Appointment date " + apmt.getAppDate() + " scheduled: true");
					}
					else if(empChoice.equals("2"))
					{
						e1.CancelApp(apmt);
						System.out.println("Appointment date " + apmt.getAppDate() + " scheduled: false");
					}
					else {
						System.out.println("You have entered an invalid choice");
					}
				}
				e1.ClearNotVer();
			}
		}
	}

}