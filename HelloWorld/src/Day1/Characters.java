package Day1;
import java.util.Scanner;
public class Characters {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a charecter: ");
		char ch = s.next().charAt(0);
		s.close();
		if (ch>='A' && ch<='Z')
		{
			ch = (char)(ch+32);
			System.out.println("Small Alphabet of Given Alphabet:"+ch);
		}
		else if(ch>='a' && ch<='z')
		{
			ch =(char)(ch-32);
			System.out.println("Capital Alphabet of Given Alphabet:"+ch);
		}
		else
		{
			System.out.println("Invalid Character");
		}
		
		
	}

}
