package day3.Assignmrnt;

import java.util.Scanner;

public class School {
	String stu_name;
	public void getDetails() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Student name ");
		stu_name = sc.next();
		sc.close();
		
		
	}
	public  void displaydetails() {
		System.out.println("Student name"+stu_name);
		
	}
	public static void main(String[] args) {
		School sc1=new School();
		//sc1.getDetails();
		//sc1.displaydetails();
		
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.studentDetails();
		s1.studentDetailDisplay();
		s1.getId();
		/*Student s2= new Student();
		s2.studentDetails();
		s2.studentDetailDisplay();
		*/
	}

}
