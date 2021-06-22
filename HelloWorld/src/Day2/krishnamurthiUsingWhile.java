package Day2;
import java.util.Scanner;

public class krishnamurthiUsingWhile {

	public static void main(String[] args) 
	{
		int fact=1, c=1, g=0, e=0, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		g=num;
		while(num>0) 
		{
			fact=1;
			c=1;
			e=num%10;
			while(c<=e) 
			{
				fact=fact*c;
				c++;
			}
			System.out.println("Fact"+fact);
			sum = sum+fact;
			num=num/10;
		}
			System.out.println("Sum of Digits number"+sum);
		
		if(g==sum)
		{
			System.out.println("Krishnamurthi number");
		}
		else
		{
			System.out.println("Not a Krishnamurthi number");
		}

	}

}
