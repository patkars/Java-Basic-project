package day3;

public class A {
protected int a=40;
int b=12;
private int c=70;
 public void show() {
	 System.out.print(a);
	 System.out.println(b);
	 System.out.println(c); 
 }
public class B{
	public void show() {
		A o =new A();
	o.show();
	System.out.println(o.a);
	System.out.println(o.b);
	System.out.println(o.c);
	}
}	
}
 class C extends A{
	public void show() {
		A o =new A();
	o.show();
	System.out.print(a);
	System.out.println(b);
	//System.out.println(c);
	}
}