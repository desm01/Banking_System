package BankSystem;

import java.util.Date;




public class Appointment {
	private Date AppDate;
	private Employee AppEmploy;
	private Client AppClient;
	private boolean Verified;
	private boolean Canceled;
	
	public Appointment(Date appDate, Employee appEmploy, Client appClient) {
		

		
		super();
		

		AppDate = appDate;
		AppEmploy = appEmploy;
		AppClient = appClient;
		Verified = false;
		Canceled = false;
	
	}
	
	public boolean isVerified() {
		return Verified;
	}

	public void setVerified() {
		Verified = true;
	}
	
	public boolean isCanceled() {
		return Canceled;
	}
	
	public void setCanceled() {
		Canceled = true;
	}

	public Client getAppClient() {
		return AppClient;
	}

	public void setAppClient(Client appClient) {
		AppClient = appClient;
	}

	public Date getAppDate() {
		return AppDate;
	}

	public void setAppDate(Date appDate) {
		AppDate = appDate;
	}

	public Employee getAppEmploy() {
		return AppEmploy;
	}

	public void setAppEmploy(Employee appEmploy) {
		AppEmploy = appEmploy;
	}
	
	public String toString()
	{
		String res = "";
		res+= "Candidate: " + AppEmploy.getName() + " Date: " + AppDate + " with client = " + AppClient.getId() + ". " + AppClient.getName();;
		return res;
	}
}
