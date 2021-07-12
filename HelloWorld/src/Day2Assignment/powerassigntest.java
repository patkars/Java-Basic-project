package Day2Assignment;

import java.util.Scanner;


public class powerassigntest {

	public static void main(String[] args) {
		int g,c,r,f,a=1,sum=0,b;
		int e;
 	    Scanner sc =new Scanner(System.in);
 	    System.out.println("Enter a number ");
        int n=sc.nextInt();
        sc.close();
        g=n;
        
        for(c=0;n!=0 ;n=n/10)
        {
        	r=n%10;
        	
        	c++;
        }
       
        System.out.println(c);
       
        for(r=0;g!=0;g/=10) {
        	r=g%10;
        	f=c;
        	 a=1;
        	while(f>0) {
        		a=a*r;
        		
        		 System.out.println("a*r="+a);
        		f--;
        	}
        	sum=sum+a;
        	 System.out.println();
        	System.out.println(sum);
        	c--;
        
        }
        
	}

}
