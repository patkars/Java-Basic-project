package day4.ConstructorStaticPolymorphism;

public class OverloadingSum {

	public void sum(int a,int b)
	{
		System.out.println("1st method is invoked");
		System.out.println(a+b);
	}  
	public void sum(int a,int b,int c)
	{
		System.out.println("2nd method is invoked");
		System.out.println(a+b+c);
	}  
	  
	  public static void main(String args[]){  
	  OverloadingSum obj=new OverloadingSum();  
	  obj.sum(20,1000); 
	  obj.sum(20,2000,50);   
	}

}
