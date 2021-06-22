package Day2;

import java.util.Scanner;

public class OddUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		sc.close();
		int c=1;
		System.out.println("Odd number : ");
		while(c<=a) 
		{
			System.out.println(c+" ");
			c= c+2;
		}
		c=1;
		System.out.println("Odd number : ");
		do
		{
			System.out.println(c+" ");
			c= c+2;
		}while(c<=a);
	}

}
