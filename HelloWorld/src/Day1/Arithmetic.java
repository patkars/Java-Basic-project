package Day1;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a1 = s.nextInt();
		System.out.println("Enter 2st Number:");
		int a2 = s.nextInt();
		s.close();
		System.out.println("Addition of 2 Number"+(a1+a2));
		System.out.println("Substaction of 2 Number"+(a1-a2));
		System.out.println("Multiplication of 2 Number"+(a1*a2));
		System.out.println("Division of 2 Number"+(a1/a2));
		System.out.println("Mod of 2 Number"+(a1%a2));
		
	}

}
