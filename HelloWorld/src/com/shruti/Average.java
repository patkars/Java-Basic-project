package com.shruti;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S=0;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter first value:");
		int n1 = r.nextInt();
		System.out.println("Enter Sencond value:");
		int n2 = r.nextInt();
		System.out.println("Enter Third value:");
		int n3 = r.nextInt();
		S= (n1 + n2 + n3)/3;
		System.out.println("Average of 3 number: " +S);
	}

}
