package com.shruti;
import java.util.Scanner;
public class percentage {

	public static void main(String[] args) {
		int per=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 Subject marks");
		int n1 = s.nextInt();
		int n2 = s.nextInt(); 
		int n3 = s.nextInt();
		per = ((n1+n2+n3)*100)/300;
		System.out.println("Percentage of 3 Subject is:"+per );
	}

}
