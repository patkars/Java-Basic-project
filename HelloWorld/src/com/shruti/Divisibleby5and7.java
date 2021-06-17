package com.shruti;

import java.util.Scanner;

public class Divisibleby5and7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = s.nextInt();
		s.close();
		if (a%5==0 && a%7==0)
		{
			System.out.println(a +" is divisible by 5 and 7");
		
		}
		else
		{
			System.out.println(a + " is not divisible by 5and 7");
		}

	}

}
