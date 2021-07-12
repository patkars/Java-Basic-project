package day4.ConstructorStaticPolymorphism;

public class Book {
String book_name , book_author;
public void read(String s, String b ) {
	book_name=s;
	book_author=b;
	System.out.println("Reading book "+book_name+"by author "+book_author);
}
}
class Magazine {
	
	String magazine_name,  magazine_author;
	public void  purchase(String s, String g) {
		magazine_author=g;
		magazine_name=s;
		System.out.println("Going through "+magazine_name);
		
	}
}
class Comic{
	String comic_name;
	public void reading(String s) {
		comic_name=s;
		System.out.println("Enjoying comic "+comic_name);
	}
}