package day5.ContainmentInheritancePolymorphism;

public class Publication {
	int p_id;
	String p_name;
	Publication(int p_id, String p_name){
	this.p_id=p_id;
	this.p_name=p_name;
	}
	public void displayDetails() {
		System.out.println("Publisher name is "+p_name);
		System.out.println("Publisher id is "+p_id);
		
	}
}
