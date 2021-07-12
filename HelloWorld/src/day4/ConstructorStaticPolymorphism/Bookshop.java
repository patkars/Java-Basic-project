package day4.ConstructorStaticPolymorphism;

public class Bookshop {
	public static void main(String[] args) {
		Book_StaticcMethod sb= new Book_StaticcMethod(0027,"shruti","Newmoon");
		sb.Displaydetails();
		sb.bill();
		Book_StaticcMethod sb1= new Book_StaticcMethod(0034,"shruti","Newmoon");
		sb1.Displaydetails();
		sb1.bill();
	}

}
