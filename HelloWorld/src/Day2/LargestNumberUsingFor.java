package Day2;

import java.util.Scanner;

public class LargestNumberUsingFor {

	public static void main(String[] args) {
		int large=0,rem=0,i;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        s.close();
        large=n%10;
        for(i=0;n!=0;n=n/10)
        {
        	rem = n % 10;
        	if(large<rem) 
        	{
        		large=rem;
        	}
        	
        }System.out.println("Largest num "+large);
	}

}
