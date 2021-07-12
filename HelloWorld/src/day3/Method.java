package day3;
import java.util.Scanner;
public class Method {

	public static void main(String[] args) {
	Method a =new Method();
	a.sumOfNaturalNumber();
	Method b =new Method();
	b.displayTable();
	Method c =new Method();
	c.maxNum();
	

	}
	
	public void sumOfNaturalNumber()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end value:");
		int a =sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			sum= sum+i;
		}
		System.out.println("Sum of natural number is "+sum);
	}	
	public void displayTable() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to find its table");
		int a =sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++) 
		{
			System.out.println(a+" x "+i+" = "+(a*i));
		}
		
	}
	public void maxNum()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int a1 = s.nextInt();
		System.out.println("Enter 2st Number:");
		int a2 = s.nextInt();
		System.out.println("Enter 3st Number:");
		int a3 = s.nextInt();
		s.close();
		if (a1>a2)
		{
			System.out.println("Biggest no is "+a1);
		}
		else if(a2>a3)
		{
			System.out.println("Biggest no is "+a2);
		}
		else
		{
			System.out.println("Biggest no is "+a3);
		}
	}
}
