package Day2;
import java.util.*;
public class PrimeNoUsingWhile 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i = 2, count = 0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		int a = sc.nextInt();
		sc.close();
		while(i <= a/2)
		{
			if(a % i == 0)
		    {
				count++;
		        break;
		    }
			i++;
		}
		if(count == 0 && a!= 1 )
		{
			System.out.println( a + " is a Prime Number");
		}
		else
		{
			System.out.println( a + " is Not a Prime Number");
		}
	}

}
