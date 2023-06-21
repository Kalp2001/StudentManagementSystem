package studentDatabaseManagement;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {	
		//asks how many students we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner sc = new Scanner(System.in);
		int noOfStudents=sc.nextInt();
		Student[] students=new Student[noOfStudents];

		//create n number of new students
		for(int n = 0; n<noOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTutition();
//			System.out.println(students[n].toString());

		}
		for(int n = 0; n<noOfStudents; n++) {
			System.out.println(students[n].toString());
		}
	}
}
