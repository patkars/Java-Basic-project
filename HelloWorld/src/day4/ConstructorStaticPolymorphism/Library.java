package day4.ConstructorStaticPolymorphism;
import java.util.Scanner;
public class Library {
	public void borrow(Book b) {
		
		b.read("Sita ", "Amish");
	}
public void borrow(Magazine m) {
		
		m.purchase("Times","shrt");
	}
public void borrow(Comic c) {
	
		c.reading("Naruto");
}
	public static void main(String[] args) {
		Library l= new Library();
		Book b= new Book();
		l.borrow(b);
		Magazine m= new Magazine();
		l.borrow(m);
		Comic c= new Comic();
		l.borrow(c);
		
	}

}
