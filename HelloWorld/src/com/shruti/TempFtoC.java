package com.shruti;
import java.util.Scanner;
public class TempFtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Celsius=0;
		Scanner S= new Scanner(System.in);
		System.out.println("Enter the Temprature in Fahrenheit :");
        int Fahrenheit = S.nextInt();  
        Celsius  = ((Fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+Celsius);  
	}

}
;