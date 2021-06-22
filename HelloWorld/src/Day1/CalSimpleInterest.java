package Day1;
import java.util.Scanner;
public class CalSimpleInterest {

	public static void main(String[] args) {
		
		 double sinterest;
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter the Principal : ");
	        double p = scan.nextDouble();
	        System.out.print("Enter the Rate of interest : ");
	        double r = scan.nextDouble();
	        System.out.print("Enter the Time period : ");
	        double t = scan.nextDouble();
	        scan.close();
	        sinterest = (p * r * t) / 100;
	        System.out.print("Simple Interest is: " +sinterest);
	}

}
