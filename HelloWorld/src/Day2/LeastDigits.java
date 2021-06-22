package Day2;

import java.util.Scanner;

public class LeastDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int small=0,rem=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = s.nextInt();
        s.close();
        small=number%10;
        number=number/10;		
        while (number > 0)
        {
            rem = number % 10;
            if(small>rem)
            {
            	small = rem;
            }
            number=number/10;
        }
        System.out.println("Least number from given number is :"+small);
	}

}
