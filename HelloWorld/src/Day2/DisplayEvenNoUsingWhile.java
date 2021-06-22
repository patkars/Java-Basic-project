package Day2;



public class DisplayEvenNoUsingWhile 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int c=0;
		System.out.println("Even number are:");
		while(c<=20)
		{
			if(c%2==0)
			{
				System.out.println(c);
			}
			c++;
		}
		c=0;
		System.out.println("Even number are:");
		do
		{
			if(c%2==0)
			{
				
				System.out.println(c);
			}
			c++;
		}while(c<=20);
		
	}
	
}
