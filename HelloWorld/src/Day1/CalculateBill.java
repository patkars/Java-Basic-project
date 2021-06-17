package Day1;

import java.util.Scanner;

public class CalculateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float b=0, c=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of Bottles you want to purchase: ");
		int a = s.nextInt();
		s.close();
		b=a*150;
		System.out.println("Bill of the Bottles purchased: " +b);
		if (b>=2000)
		{
			c= b*15/100;
			System.out.println(" Discounted price: "+c);
			
			System.out.println(" Total Discounted price"+(b-c));
			
		}
	}

}
