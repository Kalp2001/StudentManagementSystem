package studentDatabaseManagement;

import java.util.Scanner;

public class Student {
	private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses="";
    private int tuitionBalance = 0;
    private static int costofCourse = 600;
    private static int id = 1001;
    
    
	
	// Constructor: Prompt the user to enter name and year of student
    public Student() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter student first name: ");
    	this.firstName=sc.nextLine();
    	
    	System.out.println("Enter student last name: ");
    	this.lastName=sc.nextLine();
    	
    	System.out.println("1 - Freshers\n2 - Junior\n3 - Senior\nEnter student class level: ");
    	this.gradeYear=sc.nextInt();
    	setStudentID();    	
    }
	
	//Generate an ID
    private void setStudentID() { 
    	// Grade level + ID
    	id++;
    	this.studentID=gradeYear+""+id;
    }
	
	//Enroll in course
    public void enroll() {
    	//get inside loop
    	do {
    	System.out.print("Enter course to enroll(Q to Quit): ");
    	Scanner in = new Scanner(System.in);
    	String course=in.nextLine();
    	if(!course.equalsIgnoreCase("Q")) {
    		courses= courses + "\n  " + course;
    		tuitionBalance=tuitionBalance+costofCourse;
    	}
    	else {
//    		System.out.println("BREAK!");
    		break;
    	  }
    	} while(1!=0);
    	
    }

	//view balance 
    public void viewBalance() {
    	System.out.println("Your balance is: $" +tuitionBalance);
    }
	
	//Pay tuition fees
    public void payTutition() {
    	viewBalance();
    	System.out.print("Enter your payment: $");
    	Scanner sc = new Scanner(System.in);
    	int payment=sc.nextInt();
    	tuitionBalance=tuitionBalance - payment;
    	System.out.println("Thank you for your payment of $"+payment);
    	viewBalance();
    }
	
	//show status
    public String toString(){
    	return "Name: " +firstName+ " "+lastName+"\n"+
        "Grade Level: "+gradeYear+"\n"+
    	"Student ID: "+studentID+"\n"+		
        "Courses Enrolled: "+courses+"\n"+
        "Balance: $"+tuitionBalance;
    }
}

