package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstname;
	private String lastname;
	private int year;
	private String studentId;
	private String courses = "";
	private int balance = 0;
	private static int cost = 600;
	private static int id = 1000;
	
	//Constructor: Prompt user to enter the name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter firstname of student:");
		this.firstname = in.nextLine();
		
		System.out.println("Enter lastname of student:");
		this.lastname = in.nextLine();
		
		System.out.println("Enter Grade Year of student:");
		this.year = in.nextInt();
		
		setID();
		
	}
	//Generate ID
	private String setID() {
		id++;
		this.studentId = year + "" + id;
		return studentId;
	}
	//Enroll in courses
	public void enroll() {
		while(1 > 0) {
			System.out.println("Enroll into the courses (Press Q to quit)");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if((course.equals("Q"))) {
				break;
			}
			else {
				courses = courses + "\n" + course;
				balance = balance + cost;
			}
		}
	}
	//View Balance
	public void viewBalance() {
		System.out.println("Amount to pay:" + balance);
	}
	//Pay tuition
	public void payFees() {
		viewBalance();
		System.out.print("Enter Your Payment Rs");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		balance = balance - payment;
		System.out.println("Thank you for" + " " + payment);
	}
	//Show Status
	public String showStatus() {
		return "Name: " + firstname + " " + lastname +
				"\nID: " + studentId +
				"\nCourses Enrolled: " + courses +
				"Amount to pay (in Rs): " + balance;
	}

}
