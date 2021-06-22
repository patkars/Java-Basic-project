package Day2;

import java.util.Scanner;

public class PositiveNegativeusingternary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a1 = s.nextInt();
		s.close();
		
		 String sp = (a1>=0) ? a1+" Positive" :  a1+" Negative";
		System.out.println("Given number is" +sp);


	}

}
