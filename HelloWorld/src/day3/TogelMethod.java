package day3;
import java.util.*;
public class TogelMethod {

	public static void main(String[] args) {
		TogelMethod a= new TogelMethod();
		a.toggle();
		
	}
    public void toggle()
    {
    	{
    	     int c;
    	 char ch;
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter Character to be toggled ");
    	 ch=sc.next().charAt(0);
    	
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
    }
