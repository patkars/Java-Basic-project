package Day1;
import java.util.Scanner;
public class CalculateCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float pi = 3.14f;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Radius of the circle:");
		float a = s.nextFloat();
		s.close();
		a = pi*a*a;
		System.out.println("Area of Circle is: "+a);
		
	}

}
