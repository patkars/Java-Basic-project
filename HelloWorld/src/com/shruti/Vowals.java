package com.shruti;
import java.util.Scanner;
public class Vowals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char ch = s.next().charAt(0);
		
		if (ch =='a' || ch =='e' || ch =='i'|| ch =='o' || ch =='u')
		{
			System.out.println("Vowels");
		}
		else
		{
			System.out.println("Consonent");
		}
		
	}

}
