package day3;
import java.util.Scanner;
public class PowerMethod {

	public static void main(String[] args) {
	PowerMethod p = new PowerMethod();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter value of x:");
	int a = sc.nextInt();
	System.out.println("Enter value of y:");
	int b =sc.nextInt();
	sc.close();
	int c = p.powerMethod(a,b);
	System.out.println("Power is "+c);
		

	}
	public int powerMethod(int x,int y)
	{
		int c=x^y;
		return c;
	}
	
}
