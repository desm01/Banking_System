 package BankSystem;


import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Client extends Person{
	
	SimpleDateFormat myFormatObj = new SimpleDateFormat("dd/MM/yyyy");
	private int id;
	private String address;
	private String birthDate;
	private String userName;
	private String password;
	private ArrayList<BankAccount> bankAccounts; 
	private ArrayList<PrimaryAccount> primAccounts; 
	private ArrayList<SavingAccount> saveAccounts; 
	private ArrayList<Appointment> appointments;
	
	private static int idCounter = 1;
	
	
	public Client(String name, String Password, String Address, String  birthdate, String UserName) throws ParseException {
		super(name);
		
		if (Password.endsWith(".")) {
			System.out.println("Error, password cant end with '.'");
		}
		if (UserName.startsWith("$")) {
			System.out.println("Error, username cant start with '$'");
		}
		
		Date currentDate = new Date();
		
		Date date = (Date) new SimpleDateFormat("dd/MM/yyyy").parse(birthdate);
		
		if (date.after(currentDate)) {
			System.out.println("Sorry that date is after today");
		}
		
		else {
	id += idCounter++;
	password = Password;
	address = Address;
	birthDate =  birthdate;
	userName = UserName;
	bankAccounts = new ArrayList<BankAccount>();
	primAccounts = new ArrayList<PrimaryAccount>();
	saveAccounts = new ArrayList<SavingAccount>();
	appointments = new ArrayList<Appointment>();
		}
	}
	
	public Client()
	{
		super("");
	}
	
	public void addID()
	{
		id += idCounter++;
		bankAccounts = new ArrayList<BankAccount>();
		primAccounts = new ArrayList<PrimaryAccount>();
		saveAccounts = new ArrayList<SavingAccount>();
		appointments = new ArrayList<Appointment>();
	}
	
	public double getLastId() {
		if (bankAccounts.size() == 0) {
			return 0;
		}
		else {
		int length = bankAccounts.size();
		double lastId = bankAccounts.get(length -1).getBankAccountNumber();
		return lastId; 
		}
	}
	
	public void addAppointmet(Appointment a1)
	{
		appointments.add(a1);
	}
	
	public ArrayList<PrimaryAccount> getPrimAccounts() {
		return primAccounts;
	}

	public void setPrimAccounts(ArrayList<PrimaryAccount> primAccounts) {
		this.primAccounts = primAccounts;
	}

	public ArrayList<SavingAccount> getSaveAccounts() {
		return saveAccounts;
	}

	public void setSaveAccounts(ArrayList<SavingAccount> saveAccounts) {
		this.saveAccounts = saveAccounts;
	}

	public void addPrimaryAccount(BankAccount account) {
		bankAccounts.add(account);
		primAccounts.add((PrimaryAccount) account);
	}
	
	public void addSaveAccount(BankAccount account) {
		bankAccounts.add(account);
		saveAccounts.add((SavingAccount) account );
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public ArrayList<BankAccount> getBankAccounts() {
		return bankAccounts;
	}


	public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	
	public void addAppointment(Appointment ap)
	{
		appointments.add(ap);
	}
	
	public ArrayList<Appointment> getAppointments()
	{
		return appointments;
	}
	
	public void removeAccount (BankAccount choice) {
		bankAccounts.remove(choice);
	}

	public void changeDetails(int choice, String str) {
		if (choice == 1) {
			super.set_name(str); 
		} else if (choice == 2) {
			this.address = str;
		} else if (choice == 3) {
	
			setBirthDate(str);
		
		} else if (choice == 4) {
			this.userName = str;
		} else if (choice == 5) {
			this.password = str;
		}
	}

	public String getBankAccountDetails() {
		String details = ""; 
		
		for (BankAccount bc : bankAccounts) {
			details += bc.toString();
		}
		
		return details;
	}
	
	public String getBankAdminDetails() {
		String details = "";

		for (BankAccount bc : bankAccounts) {
			details += bc.getAccountDetails();
			details += getClientDetails();
		}
		return details;
	}
	
	public String getClientDetailsAppointment() {
		String details = "";
		details += "\nclientID = " + id;
		details += "\nname = " + super.getName();
		details += "\nusername = " + userName;
		details += "\npassword = " + password;

		
		//details += getBankAccountDetails();
		
		return details;
	}
	
	public String getClientDetails() {
		String details = "";
		details += "\nclientID = " + id;
		details += "\nname = " + super.getName();
		details += "\nusername = " + userName;
		details += "\npassword = " + password;
		details += "\naddress = " + address;
		details += "\nbirthDate = " + birthDate + "\n";
		
		//details += getBankAccountDetails();
		
		return details;
	}
	
}
