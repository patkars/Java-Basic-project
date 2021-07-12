package Day2;

import java.util.Scanner;

public class KrishnamurthyUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g=0,rem=0,sum=0,fact=1,j;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        s.close();
        g=n;
       
        for(;n!=0;n=n/10)
        {
        	fact=1;
        
        	rem = n % 10;
        	for(j=1;j<=rem;j++)
			{
				fact=fact*j;
			}
        	
        	System.out.println("fact num "+fact);
        	sum=sum+fact;
        	
        }System.out.println("total num "+sum);
        if(g==sum) 
        {
        	System.out.print(g+" is a Krishnamurthy Number");
        }
        else 
        {
        	System.out.print(g+" is not an Krishnamurthy Number");
        }
	}

}
