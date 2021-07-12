package day3;
import java.util.*;
public class Starpattern {

	public static void main(String[] args)
	{
	Starpattern s=new Starpattern();
	Scanner sc =new Scanner(System.in);	
	System.out.println("Enter the rows:");
	int a= sc.nextInt();
	s.star1(a);
	

	}
	public void star1(int n) 
	{
		
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<=i;j++) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		
		
		
		for(int i=0; i<n; i++)   
		{   
		for(int j=0; j<=i; j++)   
			{   
			System.out.print(" "+i+" ");   
			}   
		System.out.println();
		}
		
		
		
		System.out.println();
		
		
		
		
		for(int i=0; i<n; i++) 
		{
		for(int j=0; j<=i; j++) 
			{
				System.out.print(" "+j+" ");	
			}
		System.out.println();
		}
		
		
		System.out.println();
		
		
		
		int k=1;
		for(int i=0; i<n; i++) 
		{
		for(int j=0; j<=i; j++) 
			{
				System.out.print(" "+k+" ");
				k++;
			}
		System.out.println();
		}
		
		
		System.out.println();
		
		
		
		char ch='a';
		for (int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)ch);
				ch++;
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
		
		int i=0;
		for(char c='A';i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print((char)c);
				
			}c++;
			System.out.println();
		}
		
		System.out.println();
		
	}
}
