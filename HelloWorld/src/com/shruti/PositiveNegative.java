package com.shruti;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a value:");
		int n = s.nextInt();
		if (n>=0)
		{
			System.out.println("Positive");
		} 
		else
		{
			System.out.println("Negative");
		}
		
	}

}
