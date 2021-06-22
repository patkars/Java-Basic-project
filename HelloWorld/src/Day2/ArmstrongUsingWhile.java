package Day2;

import java.util.Scanner;

public class ArmstrongUsingWhile {

	public static void main(String[] args) {
		int sum=0, n=0, g=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int m = s.nextInt();
        g=m;
        s.close();
        while (m > 0)
        {
            n = m % 10;
            sum = sum + (n*n*n);
            m = m / 10;
        }
        if(g==sum) 
        {
        	System.out.print(g+" is an Armstrong number");
        }else
        {
        	System.out.print(g+" is not an Armstrong number:");
        }

	}

}
