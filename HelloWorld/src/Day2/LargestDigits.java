package Day2;

import java.util.Scanner;

public class LargestDigits {

	public static void main(String[] args) {
		int large=0,rem=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = s.nextInt();
        s.close();
        large=number%10;
        number=number/10;
        		
        while (number > 0)
        {
            rem = number % 10;
            if(large<rem)
            {
            	large = rem;
            }
            number=number/10;
        }
        System.out.println("Largest number from given number is :"+large);
	}

}
