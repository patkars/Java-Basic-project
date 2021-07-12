package day4.ConstructorStaticPolymorphism;

import java.util.Scanner;

public class Student {
	String stu_name;
	int stu_id, marks_1, marks_2, marks_3;
	float percentage;
	Student(){
		stu_name="Shruti";
		stu_id=0027;
		marks_1=80;
		marks_2=90;
		marks_3=80;
		System.out.println("I am inside default constructor");
	}
	Student(String stu_name, int stu_id, int marks_1,int marks_2,int marks_3 ){
		this.stu_name=stu_name;
		this.stu_id=stu_id;
		this.marks_1=marks_1;
		this.marks_2=marks_2;
		this.marks_3=marks_3;
		System.out.println("I am inside parametric constructor");
	}
	
	/*public void studentDetails() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student name:");
		stu_name= sc.next();
		System.out.println("Enter Student id");
		stu_id =sc.nextInt();
		System.out.println("Enter Physics marks");
		marks_1 =sc.nextInt();
		System.out.println("Enter Chemistry marks");
		marks_2 =sc.nextInt();
		System.out.println("Enter Maths marks");
		marks_3 =sc.nextInt();
		System.out.println("Student Details are Intialized");
	}*/
	public void studentDetailDisplay() {
		System.out.println("Student Name: "+stu_name);
		System.out.println("Student id is: "+stu_id);
		System.out.println("Physics marks are: "+marks_1);
		System.out.println("Chemistry marks are: "+marks_2);
		System.out.println("Maths marks are: "+marks_3);
		//studentPercentage();
		//System.out.println("Display Percentage"+percentage);
		//studentGrade();
	}
	
	public void studentPercentage() {
		
		percentage =(marks_1+marks_2+marks_3)*100/300;
		
	}
	public void studentGrade() {
		if ( percentage >=80 && percentage <=100) 
		{
			System.out.println("Grade A");
		}
		else if ( percentage >=60 && percentage <=79)
		{
			System.out.println("Grade B");
		}
		else if ( percentage >=40 && percentage <=59)
		{
			System.out.println("Grade C");
		}
		else if (percentage <= 39)
		{
			System.out.println("Failed");
		}
	}
}	
