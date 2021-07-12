package Day1Assignment;
import java.util.Scanner;

public class CetimeterMeterKilometers {

	public static void main(String[] args) 
	{
		
        final double METER      = 0.01;
        final double KILOMETER  = 0.00001;
 
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter length in centimeters : ");
        double cm = in.nextDouble();
        in.close();
        double m    = cm * METER;
        double km   = cm * KILOMETER;
       
        System.out.println(cm + " cm is equal to " + m    + " meters.");
        System.out.println(cm + " cm is equal to " + km + " kilometers.");
	}

}
