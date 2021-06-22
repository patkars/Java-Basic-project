package Day2;
import java.util.Scanner;
public class TableUsinfwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a = sc.nextInt();
		sc.close();
		int count=1,b=0;
		System.out.println("Table of "+a+" (using while) is:");
		while(count<=10)
		{
			
			b=a*count;
			System.out.println(a+"x"+count+"="+b);
			count++;
			
		}
		
		count=1;
		System.out.println("Table of "+a+" (using do-while) is:");
		do 
		{
			b=a*count;
			System.out.println(a+"x"+count+"="+b);
			count++;
		}while(count<=10);
	}

}
