package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//Asks for the number of new students
		System.out.print("Enter the number of students to be enrolled: ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		//Create students
		Student[] students = new Student[number-1];
		for(int i = 0; i < number; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payFees();
			System.out.println(students[i].showStatus());
			System.out.println("Welcome student" + i+1);
		}

	}

}
