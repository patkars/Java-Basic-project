package day3;
import java.util.*;

public class EmployeePayroll {

	public static void main(String[] args) {
	Employee e = new Employee();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Employee Name:");
	String s = sc.next();
	System.out.println("Enter Employee id:");
	int a = sc.nextInt();
	System.out.println("Emter Employee Salary:");
	int b = sc.nextInt();
	e.getDetails(s, a, b);
	System.out.println("Employee details are intialized.");
	e.displayDetails();
	
	

	}

}
