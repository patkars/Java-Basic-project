package Day1Assignment;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r = new Scanner(System.in);
		System.out.println("Enter x value:");
		int n1 = r.nextInt();
		System.out.println("Enter power value:");
		int n2 = r.nextInt();
		r.close();
		;
		System.out.println("power of number: " +(n1^n2));
	}

}
