package Day1;
import java.util.Scanner;
public class BiggestNoOutOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a1 = s.nextInt();
		System.out.println("Enter 2st Number:");
		int a2 = s.nextInt();
		System.out.println("Enter 3st Number:");
		int a3 = s.nextInt();
		s.close();
		if (a1>a2)
		{
			System.out.println("Biggest no is "+a1);
		}
		else if(a2>a3)
		{
			System.out.println("Biggest no is "+a2);
		}
		else
		{
			System.out.println("Biggest no is "+a3);
		}
	}

}
