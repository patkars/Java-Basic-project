package day5.ContainmentInheritancePolymorphism;

public class Society {
	String s_name;
	int s_survey;
	Building b;
	Society(String s_name, int s_survey, Building b ){
		this.b=b;
		this.s_name=s_name;
		this.s_survey=s_survey;
	}
	public void displaySocietyDetails() {
		System.out.println("Society name is "+s_name);
		System.out.println("Society Survey no is "+s_survey);
		b.displayBuildingDetails();
	}
	public static void main(String[] args) {
		Flats f= new Flats(27, 450,"Mr.xyz");
		Building b= new Building(4, "Daivat", f);
		Society s = new Society("Datar Colony",58 , b);
		s.displaySocietyDetails();
				
	}
}
