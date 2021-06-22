package Day2;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, n=0, g=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int m = s.nextInt();
        g=m;
        s.close();
        while (m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
            sum=sum*sum;
        }
        System.out.println("total num:"+sum);
        if(g==sum) 
        {
        	System.out.println("It is a Neon number");
        }
        else 
        {
        	System.out.println("It is not a Neon number");
        }
	}

}
