package Day2;

import java.util.Scanner;

public class BillCalUsingTernary {

	public static void main(String[] args) {
		double  a1=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of Bottles you want to purchase: ");
		int a = s.nextInt();
		s.close();
		
		a1= a*150;
		s.close();
		double sc = (a1>=5000) ? a1*10/100 : a1;
		System.out.println("Discount is" +sc);
		System.out.println("Total bill is" +(a1));
		System.out.println("Total Discounted bill is" +(a1-sc));

	}

}
