package day5.ContainmentInheritancePolymorphism;

public class Book {
	String book_name;
	int book_id, book_price;
	Publication p;
	Book(String book_name, int book_id,int book_price, Publication p){
		this.book_name=book_name;
		this.book_id=book_id;
		this.book_price=book_price;
		this.p=p;
	}
	public void displayDetails() {
		System.out.println("Book name is "+book_name);
		System.out.println("Book id is "+book_id);
		System.out.println("book price is "+book_price);
		p.displayDetails();
	}
	
	public static void main(String[] args) {
		Publication p1= new Publication(23664,"Luna");
		Book b1 = new Book("Newmoon",123,300,p1);
		b1.displayDetails();

	}

}
