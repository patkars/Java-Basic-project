package Day1Assignment;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner r = new Scanner(System.in);
		System.out.println("Enter length:");
		int n1 = r.nextInt();
		System.out.println("Enter breadth:");
		int n2 = r.nextInt();
		r.close();
		System.out.println("Perimeter of Rectangle: " +(n1*n2));
		System.out.println("Perimeter of Rectangle: " +(2*(n1+n2)));
	}
}
