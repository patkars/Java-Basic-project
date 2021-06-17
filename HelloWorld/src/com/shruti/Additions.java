package com.shruti;

import java.util.Scanner;

public class Additions {

	public static void main(String[] args) {
		
		int S=0;
		Scanner r = new Scanner(System.in);
		System.out.println("Enter first value:");
		int n1 = r.nextInt();
		System.out.println("Enter Sencond value:");
		int n2 = r.nextInt();
		S= n1 + n2;
		System.out.println("Addtion of 2 number: " +S);
	}

}
