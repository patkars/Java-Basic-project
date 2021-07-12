package day5.ContainmentInheritancePolymorphism;

public class Showroom {

	public static void main(String[] args) {
		Bike b = new Bike("Honda","Pink","xyz",0027,"petrol",100000,45,40,500);
				b.displayBike();
		System.out.println();
		Car c = new Car("Maruti Suzuki","Grey","spectra",0027,"petrol",1000000, 7,10000,"Shruti Patkar");
		c.displayCar();
	}

}
