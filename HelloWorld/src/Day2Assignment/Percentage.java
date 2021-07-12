package Day2Assignment;

import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double per=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Subject Mark:");
		double n1 = s.nextDouble();
		System.out.println("Enter 2st Subject Mark:");
		double n2 = s.nextDouble();
		System.out.println("Enter 3st Subject Mark:");
		double n3 = s.nextDouble();
		s.close();
		per = ((n1+n2+n3)*100)/300;
		System.out.println("Percentage of 3 Subject is:"+per );
		if ( per >=80 && per <=100) 
		{
			System.out.println("Grade A");
		}
		else if ( per >=60 && per <=79)
		{
			System.out.println("Grade B");
		}
		else if ( per >=40 && per <=59)
		{
			System.out.println("Grade C");
		}
		else if (per <= 39)
		{
			System.out.println("Failed");
		}
	}

}
