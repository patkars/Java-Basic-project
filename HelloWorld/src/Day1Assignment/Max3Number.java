package Day1Assignment;
import java.util.Scanner;

public class Max3Number {

	public static void main(String[] args) 
	{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter first value:");
	int n1 = sc.nextInt();
	System.out.println("Enter Second value:");
	int n2 = sc.nextInt();
	System.out.println("Enter Third value:");
	int n3 = sc.nextInt();
	sc.close();
	if(n1>n2) 
		{
		System.out.println(n1+" is Largest");
		}
 	else
		if(n2>n3) 
		{
		System.out.println(n2+" is Largest");
		}
		else 
		{
		System.out.println(n3+" is Largest");
		}

	}

}
