package Day2;
import java.util.Scanner;

public class MenuCard1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int c;
		System.out.println("Welcome to XYZ Hotel");
		System.out.println("Breakfast Menu");
		System.out.println("1.Bata wada Sambhar");
		System.out.println("2.Upma");
		System.out.println("3.Misal Pav");
		System.out.println("4.Medu Wada");
		System.out.println("5.Rava Masala Dosa");
		System.out.println("6.Masala Dosa");
		System.out.println("7.Uttapam");
		System.out.println("8.Kotimbir Wadi");
		System.out.println("9.Idli");
		System.out.println("10.Paratha");
		System.out.println("Please Enter the number of the item");
		int a =sc.nextInt();
		switch(a) 
		{
		case 1 :{
			System.out.println("Enter the quantity of Bata wada Sambhar");
			int b =sc.nextInt();
			c =30*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 2 :{
			System.out.println("Enter the quantity of Upma");
			int b =sc.nextInt();
			c =50*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 3 :{
			System.out.println("Enter the quantity of Misal Pav");
			int b =sc.nextInt();
			c =60*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 4 :{
			System.out.println("Enter the quantity of Medu Wada");
			int b =sc.nextInt();
			c =30*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 5 :{
			System.out.println("Enter the quantity of Rava Masala Dosa");
			int b =sc.nextInt();
			c =70*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 6 :{
			System.out.println("Enter the quantity of Masala Dosa");
			int b =sc.nextInt();
			c =60*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 7 :{
			System.out.println("Enter the quantity of Uttapam");
			int b =sc.nextInt();
			c =30*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 8 :{
			System.out.println("Enter the quantity of Kotambir Wadi");
			int b =sc.nextInt();
			c =30*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 9 :{
			System.out.println("Enter the quantity of Idli");
			int b =sc.nextInt();
			c =40*b;
			System.out.println("Your Bill is "+c);
			break;
				}
		case 10 :{
			System.out.println("Enter the quantity of Paratha");
			int b =sc.nextInt();
			c =50*b;
			System.out.println("Your Bill is "+c);
			break;
			}
		default:{
			System.out.println("Wrong Value Entered");
				}
		}
		

	}

}
