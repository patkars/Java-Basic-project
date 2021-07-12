package Day2;

import java.util.Scanner;

public class LeastDigitsUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int small=0,rem=0,i;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        s.close();
        small=n%10;
        for(i=0;n!=0;n=n/10)
        {
        	rem = n % 10;
        	if(small>rem) 
        	{
        		small=rem;
        	}
        }System.out.println("smallest num "+small);
        		
	}

}
