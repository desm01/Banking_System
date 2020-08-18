package BankSystem;


import java.util.ArrayList;

public class Employee extends Person {

	
	private ArrayList<Appointment> appointmentsNotVer;
	private ArrayList<Appointment> appointmentsVer;
	//private ArrayList <String> clients;
	
	public Employee(String name) {	
		super(name);
		appointmentsNotVer = new ArrayList<Appointment>();
		appointmentsVer = new ArrayList<Appointment>();
	}
	
	public ArrayList<Appointment> getAppointmentsNotVer()
	{
		return this.appointmentsNotVer;
	}
	
	public ArrayList<Appointment> getAppointmentsVer()
	{
		return this.appointmentsVer;
	}
	
	public void VerifyApp(Appointment ap1)
	{
		ap1.setVerified();
		appointmentsVer.add(ap1);
	}
	
	public void CancelApp(Appointment ap1)
	{
		ap1.setCanceled();
	}
	
	public void ClearNotVer()
	{
		//int size = appointmentsNotVer.size();
		for(int x = appointmentsNotVer.size() -1; x>=0 ; x-- )
		{
			if(appointmentsNotVer.get(x).isCanceled() == true || appointmentsNotVer.get(x).isVerified() == true)
			{
				appointmentsNotVer.remove(x);
			}
		}
	}
	
	//public String toString()
	//{
	//	String res = "";
	//	for (String s : appointments)
	//	{
	//		res+= s + "\n";
	//	}
	//	return res;
	//}
	
	public void addAppointment(Appointment app1)
	{
		appointmentsNotVer.add(app1);
	}
	
	public String AppsNotVerified()
	{
		String output = "";
		for (Appointment a : appointmentsNotVer)
		{
			output+= a;
		}
		return output;
	}
}