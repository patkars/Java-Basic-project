package Day1Assignment;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		
		int S=0;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter side of a Square :");
		int n1 = r.nextInt();
		
		r.close();
		S= n1 * n1;
		System.out.println("Area of square: " +S);
	}

}
