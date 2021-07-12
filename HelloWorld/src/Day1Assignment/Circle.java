package Day1Assignment;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float pi = 3.14f ;
		float r=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of the circle:");
		float a = s.nextFloat();
		s.close();
		r = pi*a*a;
		System.out.println("Area of Circle is: "+r);
		System.out.println("Perimeter of Circle is: "+(2*pi*a));
		System.out.println("Diameter of Circle is: "+(2*a));
		
	}

}
