package day5.ContainmentInheritancePolymorphism;

public class Building {
	Flats f;
	int b_no,f_no;
	String b_name;
	Building (int b_no, String b_name, Flats f){
		this.b_no=b_no;
		
		this.f=f;
		this.b_name=b_name;
	}
	public void displayBuildingDetails() {
		System.out.println("Building no :"+b_no);
		System.out.println("Building number :"+b_name);
		System.out.println("");
		f.displayFlatDetails();
	}
	
	
}
