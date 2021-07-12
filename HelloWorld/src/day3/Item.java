package day3;
import java.util.Scanner;
public class Item {
	int item_id, item_cost;
	String item_name, supplier_name;
	

 void getDetails()
 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter item Name:");
	 item_name=sc.next();
	 System.out.println("Enter item Id");
	 item_id=sc.nextInt();
	 System.out.println("Enter item Cost");
	 item_cost=sc.nextInt();
	 System.out.println("Enter supplier name");
	 supplier_name=sc.next();
	 sc.close();
	 showDetails();
	
 }
 void showDetails()
 {
	 System.out.println("Item name: "+item_name);
	 System.out.println("Item id: "+item_id);
	 System.out.println("Item cost: "+item_cost);
	 System.out.println("Supplier name: "+supplier_name);
	 
 }
 
public static void main(String[] args) {
	Item a = new Item();
	a.getDetails();
	//a.showDetails();
	
}
}