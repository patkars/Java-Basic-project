package Day1;
import java.util.Scanner;
public class Post {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Salary");
		int a= s.nextInt();
		s.close();
		
		if ( a >=80000) 
		{
			System.out.println("Vice President");
		}
		else if ( a >=60000 && a <80000)
		{
			System.out.println("Asistant Vice President");
		}
		else if ( a >=40000 && a <60000)
		{
			System.out.println("Manager");
		}
		else if (a >= 20000 && a<40000 )
		{
			System.out.println("Asistant Manager");
		}else
		{
			System.out.println("System Executive");
		}
	}

}
