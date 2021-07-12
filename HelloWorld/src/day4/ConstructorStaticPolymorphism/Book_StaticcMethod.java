package day4.ConstructorStaticPolymorphism;
import java.util.*;
public class Book_StaticcMethod {
	int  book_quantity,book_id;
	double book_price,book_total_price, gst;
	String book_author, Book_name;
	static int instance_counter=0;
	static String book_publisher, book_supplier;
	Scanner sc= new Scanner(System.in);
	
	Book_StaticcMethod(int id ,String book_author, String book_name){
		this.Book_name=book_name;
		this.book_author=book_author;
		book_id= id;	
		instance_counter+=1;
	}
	static {
		book_publisher="Luna Publication";
		System.out.println(book_publisher);
		
		
		
	}
	static{

		book_supplier="Bookworm Supplier";
		System.out.println(book_supplier);
	}
public void Displaydetails() {
		System.out.println("Book name is "+ Book_name);
		System.out.println("Book author is "+book_author);
		System.out.println("Book id is "+book_id);
		System.out.println("Instance counter"+instance_counter);
		
	}
	public void bill() {
		
		System.out.println("Enter the Quantity of books");
		int a= sc.nextInt();
		book_price=200;
		gst=0.185*book_price;
		book_total_price=(gst+book_price)*a;
		System.out.println("Book price "+book_total_price);
		
	}
	
}
