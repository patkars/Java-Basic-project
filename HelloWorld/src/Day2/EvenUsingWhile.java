package Day2;
import java.util.Scanner;
public class EvenUsingWhile {

	public static void main(String[] args) 
	{
		int i=1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Print all even number until:\n");
		int num=sc.nextInt();
		sc.close();
		System.out.print("even number from "+i+" to "+num+" are: \n");
		while(i<=num){
		if(i%2==0){
		System.out.print(i+"\n");
		}
		 i++;
		}
		
        
	}

}
