package Day1;
import java.util.Scanner;
public class Swap2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		int t=0;
		
	       System.out.println("Enter the value of X and Y");  
	      int x = sc.nextInt();  
	      int y = sc.nextInt();  
	      sc.close();
	       System.out.println("before swapping numbers: "+x +"  "+ y);  
	       
	       t = x;  
	       x = y;  
	       y = t;  
	       System.out.println("After swapping: "+x +"   " + y);  
	         
	}

}
