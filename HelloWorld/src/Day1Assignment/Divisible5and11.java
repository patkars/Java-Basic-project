package Day1Assignment;

import java.util.Scanner;

public class Divisible5and11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = s.nextInt();
		s.close();
		if (a%5==0 && a%11==0)
		{
			System.out.println(a +" is divisible by 5 and 11");
		
		}
		else
		{
			System.out.println(a + " is not divisible by 5 and 11");
		}
	}

}
