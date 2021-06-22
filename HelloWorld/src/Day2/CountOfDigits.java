package Day2;

import java.util.Scanner;

public class CountOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n = sc.nextInt();
		sc.close();
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
			
		}
		System.out.println("count is "+c);
		/*int c=0;
		do
		{
			n=n/10;
			c++;
		}while(n!=0);
		System.out.println("count is "+c); */
		
		
	}
	

}
