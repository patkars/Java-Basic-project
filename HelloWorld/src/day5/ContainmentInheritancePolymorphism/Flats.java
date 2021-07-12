package day5.ContainmentInheritancePolymorphism;

public class Flats {
	int flat_no;
	double flat_area;
	String flat_owner;
	Flats(int falt_no, double flat_area, String flat_owner){
		this.flat_owner=flat_owner;
		this.flat_area=flat_area;
		this.flat_no=falt_no;
	}
	public void displayFlatDetails() {
		System.out.println("Flat owner name is "+flat_owner);
		System.out.println("Flat area is "+flat_area);
		System.out.println("Flat no is "+flat_no);
	}
}
