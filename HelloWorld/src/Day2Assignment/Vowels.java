package Day2Assignment;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Alphabet:");
		char ch = sc.next().charAt(0);
		sc.close();
		
		
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
