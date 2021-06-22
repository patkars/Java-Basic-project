package Day2;

import java.util.Scanner;

public class EvenOddusingternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a1 = s.nextInt();
		s.close();
		String sc = (a1%2==0) ? a1+ "even": a1 +"odd";
		System.out.println("Given number is" +sc);
	}

}
