package Day2;

import java.util.Scanner;

public class AverageUsingwhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a=0,c=0;
		System.out.println("Enter Numbers:");
		 a = sc.nextInt();
		while(a!=-99)
		{
			sum=(sum+a);
			System.out.println("Enter Numbers:");
			 a = sc.nextInt();
			
			
			
			c++;
			
		}
		sc.close();
		System.out.println("Sum of entered numbers is: "+sum);
		
		sum= sum/c;
		System.out.println("Average of entered numbers is: "+sum);

	}

}
