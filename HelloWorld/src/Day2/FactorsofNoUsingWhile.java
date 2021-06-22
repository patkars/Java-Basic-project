package Day2;

import java.util.Scanner;

public class FactorsofNoUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = sc.nextInt();
		sc.close();
		int c=1,sum=0;
		System.out.println("factors of "+a+ "is ");
		while(c<=a)
		{
			sum=sum+c;
			System.out.println(" "+c);
			c++;
		}
		
		
		
	}

}
