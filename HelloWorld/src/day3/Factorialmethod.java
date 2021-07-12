package day3;
import java.util.Scanner;
public class Factorialmethod 
{

	public static void main(String[] args) 
	{
		
		Scanner scan =new Scanner(System.in);
		Factorialmethod a= new Factorialmethod();
		System.out.println("Enter a number for find factorial"); 
		int num=scan.nextInt();
		scan.close();
		int c= a.factorial(num);
		System.out.print("Factorial is "+c) ;
	}
	public int factorial(int n)
	{
		int i,f=1;
		for(i=1; i<=n; i++)
		{
		f=f*i;
		}
		return f;
	
		
		
	}

}
