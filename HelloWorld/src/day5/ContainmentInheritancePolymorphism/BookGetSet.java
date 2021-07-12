package day5.ContainmentInheritancePolymorphism;

public class BookGetSet 
{
		String book_name;
		int book_id, book_price;
		PublicationGetSet p;
		public void setBook_id(int book_id)
		{
			this.book_id=book_id;
		}
		public void setBook_name(String name)
		{ 
			book_name=name;
		}
		public void setBook_price(int book_price)
		{
			this.book_price=book_price;
		}
		public void setP(PublicationGetSet p) 
		{
			this.p=p;
		}
		
		
		public void displayDetails() 
		{
			System.out.println("Book name is "+book_name);
			System.out.println("Book id is "+book_id);
			System.out.println("book price is "+book_price);
		
		}
public static void main(String s[])
{
	
}
	

}

