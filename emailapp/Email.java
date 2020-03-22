package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxcapacity;
	private String altemail;
	private int defaultLength = 10;
	
	//Constructor to recieve first name and last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Info is" + this.firstname + " " + this.lastname);
		this.department = setDepartment();
		System.out.println("Department:" + " " + this.department);
		this.password = randomPassword(defaultLength);
		System.out.println("Password:" + " " + this.password);
		this.email = firstname.toLowerCase()+"."+lastname.toLowerCase() + "@" + department.toLowerCase() + "." + "goa.com";
		System.out.println("Email:" + " " + this.email);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter no:");
		Scanner in = new Scanner(System.in);
		int depchoice = in.nextInt();
		if(depchoice == 1) {return "sales";}
		else if(depchoice == 2) {return "development";}
		else if(depchoice == 3) {return "accounting";}
		else {return "";}
		
	}
	//Generate random password
	private String randomPassword(int length) {
		String set = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++) {
			int rand = (int)(Math.random()* set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
		
		
	}
	//set mailboxcapacity 
	public void setmailboxcapacity(int capacity) {
		this.mailboxcapacity = capacity;
	}
	
	//set alternate email
	public void setaltemail(String altemail) {
		this.altemail = altemail;
	}
	
	//change password
	public void setnewpass(String newpass) {
		this.password = newpass;
	}
	public int getmailboxcapacity() {return mailboxcapacity;}
	public String getaltemail() {return altemail;}
	public String getnewpass() {return password;}

}
