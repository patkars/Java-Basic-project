package Day2;

import java.util.Scanner;

public class MenuCard2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int d=0;
		System.out.println("Welcome to XYZ Hotel");
		System.out.println("Menu");
		System.out.println("1.Starter");
		System.out.println("2.Sabji");
		System.out.println("3.Flat bread");
		System.out.println("4.Rice");
		System.out.println("Enter a Choice Number");
		int a= sc.nextInt();
		switch(a)
		{
		case 1:
			{
				System.out.println("Starter Menu");
				System.out.println("A. Paneer Tikka");
				System.out.println("B. Veg Crispy");
				System.out.println("C. Spring Roll");
				System.out.println("Enter the Starter Value");
				char b=sc.next().charAt(0);
				switch(b)
				{
				case 'A':{
					System.out.println("Enter the quantity of Paneer Tikka");
					int c =sc.nextInt();
					d =300*b;
					System.out.println("Your Bill is "+c);
					break;
				}
				case 'B':{
					System.out.println("Enter the quantity of Veg Crispy");
					int c =sc.nextInt();
					d =300*b;
					System.out.println("Your Bill is "+c);
					break;
				}
				case 'C':{
					System.out.println("Enter the quantity of Spring Roll");
					int c =sc.nextInt();
					d =300*b;
					System.out.println("Your Bill is "+c);
					break;
				}
				default: {
					System.out.println("Enter value is wrong");
				}
				}
				
				
			}
		case 2:
		{
			System.out.println("Sabji Menu");
			System.out.println("A. Paneer Tikka Masala");
			System.out.println("B. Palak Paneer");
			System.out.println("C. Veg Kolhapuri");
			System.out.println("Enter the Sabji Value");
			char b=sc.next().charAt(0);
			switch(b)
			{
			case 'A':{
				System.out.println("Enter the quantity of Paneer Tikka masala");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			case 'B':{
				System.out.println("Enter the quantity of Palak Paneer");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			case 'C':{
				System.out.println("Enter the quantity of Veg Kolhapuri");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			default: {
				System.out.println("Enter value is wrong");
			}
			}
		}case 3:
		{
			System.out.println("Roti Menu");
			System.out.println("A. naan");
			System.out.println("B. Kulcha");
			System.out.println("C. Butter roti");
			System.out.println("Enter the Starter Value");
			char b=sc.next().charAt(0);
			switch(b)
			{
			case 'A':{
				System.out.println("Enter the quantity of Naan");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			case 'B':{
				System.out.println("Enter the quantity of Kulcha");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			case 'C':{
				System.out.println("Enter the quantity of Butter Roti");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			default: {
				System.out.println("Enter value is wrong");
			}
			}
		}
		case 4:
		{
			System.out.println(" Rice Menu");
			System.out.println("A. Jeera Rice");
			System.out.println("B. Plain Rice");
			System.out.println("C. Biryani");
			System.out.println("Enter the Starter Value");
			char b=sc.next().charAt(0);
			switch(b)
			{
			case 'A':{
				System.out.println("Enter the quantity of Jeera Rice");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			case 'B':{
				System.out.println("Enter the quantity of Plain Rice");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			case 'C':{
				System.out.println("Enter the quantity of Biryani");
				int c =sc.nextInt();
				d =300*b;
				System.out.println("Your Bill is "+c);
				break;
			}
			default: {
				System.out.println("Enter value is wrong");
			}
			}
			
		}
		}

	}
}
