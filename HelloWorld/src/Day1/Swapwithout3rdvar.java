package Day1;
import java.util.*;
public class Swapwithout3rdvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the value of x"); 
        int x = sc.nextInt();  
        System.out.println("Enter the value of y"); 
        int y = sc.nextInt();  
        sc.close();
        System.out.println("before swapping numbers: "+x +" "+ y);  
       
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
	}

}
