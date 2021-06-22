package Day2;

import java.util.Scanner;

public class SumofDigitsUsingWhile {

	public static void main(String[] args) {
		int sum=0, n=0;
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int m = s.nextInt();
        s.close();
        while (m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
	}

}