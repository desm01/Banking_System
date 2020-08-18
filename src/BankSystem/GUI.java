package BankSystem;

import java.util.Scanner;

public class GUI {

	private String options[];	
	private String title;		
	private String decider;
	private Scanner input = new Scanner(System.in);
	
	public GUI(String title, String options[], String Decider) {
	this.title = title;
	copyOptions(options);
	decider = Decider;
	}
	
	public int getChoice() {
		System.out.print("Enter choice: ");
		int choice = input.nextInt();
		return choice;
	}
	
	public void display() {
		if (title != null && options !=null) {
			// title and options are valid
			// display title and underline with '+'
			System.out.println(title);
			for(int i=0;i<title.length();i++) {
				System.out.print("+");
			}
			System.out.println("\n");
			// display the menu options
			// prefix each with an int starting at 1
			int count = 0;
			
			if (decider.contentEquals("register")) {
			for(String str : options) {
				if (count == 2) {
					System.out.println("4. " +str);
				}
				else {
				System.out.println(count+". "+str);
				}
				count++;
			}
			}
			else if (decider.contentEquals("login")) {
				for(String str : options) {
					if (count == 0) {
						System.out.println(count+ ". " +str);
					}
					
					else if (count > 0 && count < 6) {
						System.out.println(count+4 + ". " +str);
					}
					
					count++;
				}
			}
			System.out.println();
		}
		else {
			 //title and/or options are not valid
			System.out.println("Menu not defined.");
		}
	}
	
	private void copyOptions(String data[]) {
		if ( data != null) {
			options = new String[data.length];
			for(int index=0;index<data.length;index++) {
				options[index] = data[index];
			}
		}
		else {
			options = null;
		}
	}
}