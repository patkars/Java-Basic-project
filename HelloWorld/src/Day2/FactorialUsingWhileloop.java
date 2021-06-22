package Day2;

import java.util.Scanner;

public class FactorialUsingWhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a = sc.nextInt();
		sc.close();
		int c=1,fact=1;
		while(c<=a)
		{
			fact= fact*c;
			c++;
		}
		System.out.println("Factorial of "+a+" is : "+fact);
		c=1;
		fact=1;
		do
		{
			fact= fact*c;
			c++;
		}while(c<=a);
		System.out.println("Factorial of "+a+" is : "+fact);
	}
	

}
