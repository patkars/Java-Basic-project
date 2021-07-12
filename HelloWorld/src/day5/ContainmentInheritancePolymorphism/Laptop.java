package day5.ContainmentInheritancePolymorphism;

public class Laptop {
	int laptop_id, laptop_cost;
	String laptop_brand;
	Software sw_1, sw_2, sw_3;
	Laptop(int l_id,int l_cost, String l_brand){
		laptop_id=l_id;
		laptop_brand=l_brand;
		laptop_cost=l_cost;
		sw_1 =new Software(8.1,"java","Oracle");
		sw_2=new Software(8.1,"python","PSF");
		sw_3=new Software(4.1,"R","Rstudio");
	}
	public void displayDetails() {
	System.out.println("laptop id is "+laptop_id);	
	System.out.println("Laptop brand is "+laptop_brand);
	System.out.println("Laptop cost is "+laptop_cost);
	System.out.println("Pre installed software are");
	sw_1.displayDetails();
	sw_2.displayDetails();
	sw_3.displayDetails();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 =new Laptop(27, 20000, "Lenovo");
		l1.displayDetails();
		
	}

}
