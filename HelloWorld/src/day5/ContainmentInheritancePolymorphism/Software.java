package day5.ContainmentInheritancePolymorphism;

public class Software 
{
	double sw_version; 
	String sw_name, sw_vendor;
	Software(double d, String sw_name, String sw_vendor){
		this.sw_name=sw_name;
		this.sw_vendor=sw_vendor;
		this.sw_version=d;
}
	public void displayDetails() {
		System.out.println("Software name is "+sw_name);
		System.out.println("Software vendor is "+sw_vendor);
		System.out.println("Software version is "+sw_version);
	}
}
