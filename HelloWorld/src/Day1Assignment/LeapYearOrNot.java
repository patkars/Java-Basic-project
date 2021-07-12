package Day1Assignment;
import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter an Year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();

		if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
			System.out.println(year+" year is a leap year");
		else
			System.out.println(year+" year is not a leap year");
	}

}
