package Day2;

import java.util.Scanner;

public class ArmstrongUsingFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g=0,rem=0,i,sum=0,o=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = s.nextInt();
        s.close();
        g=n;
        
        for(i=1;n!=0;n=n/10)
        {
        	rem = n % 10;
        	o=rem*rem*rem;
        	sum=sum+o;
        }System.out.println("total num "+sum);
        if(g==sum) 
        {
        	System.out.print(g+" is an Armstrong Number");
        }
        else 
        {
        	System.out.print(g+" is not an Armstrong Number");
        }
	}

}
