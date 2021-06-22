package Day2Assignment;
import java.util.*;
public class SumofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        s.close();
        if (m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("Sum of Digits:"+sum);
	}

}
