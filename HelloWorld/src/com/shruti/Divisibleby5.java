package com.shruti;
import java.util.Scanner;
public class Divisibleby5 {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = S.nextInt();
		if (a%5==0)
		{
			System.out.println(a +"is divisible by 5");
		
		}
		else
		{
			System.out.println(a + "is not divisible by 5");
		}
		
		
	}

}
