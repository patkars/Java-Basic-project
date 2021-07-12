package day5.ContainmentInheritancePolymorphism;

public class Vehicle 
{
	 String v_engtype;
	   int v_cost,v_regno;
	   Vehicle(int r, int c, String e)
	 {
	        v_regno=r;
	        v_cost=c;
	        v_engtype=e;
	    }
	    void displayVehicle()
	    {
	        System.out.println("Registration no: "+v_regno);
	        System.out.println("Model no: "+v_cost);
	        System.out.println("Engine type: "+v_engtype);    
	    }
}
	 
	class Twowheeler extends Vehicle
	{
	   
	    String brand, colour, dealer;
	    
	    public Twowheeler(String brand, String colour, String dealer,int v_regno, String v_engtype, int v_cost) {
		super(v_regno,v_cost,v_engtype);	
		this.brand=brand;
		this.colour=colour;
		this.dealer=dealer;
		}
	    
	    void displayTwowheeler()
	    {
	        System.out.println("Brand name: "+brand);
	        System.out.println("Colour of 2 wheeler: "+colour);
	        System.out.println("Dealer name: "+dealer);
	        super.displayVehicle();
	    }
	}
	 
	class Fourwheeler extends Vehicle
	{
		String brand, colour, dealer;
	    Fourwheeler(String brand, String colour, String dealer,int v_regno, String v_engtype, int v_cost)
	    {
			super(v_regno,v_cost,v_engtype);
	    	this.brand=brand;
			this.colour=colour;
			this.dealer=dealer;
	    }
	    void displayFourwheeler()
	    {
	    	 System.out.println("Brand name: "+brand);
		     System.out.println("Colour of 2 wheeler: "+colour);
		     System.out.println("Dealer name: "+dealer);
		     super.displayVehicle();
	    }
	}
	class Bike extends Twowheeler{
		int average, weight,r_km;
		public Bike(String brand, String colour, String dealer, int v_regno, String v_engtype, int v_cost, int average , int weight, int r_km) {
			super(brand, colour, dealer, v_regno, v_engtype, v_cost);
			this.average=average;
			this.weight=weight;
			this.r_km=r_km;
		}
		public void displayBike() {
			System.out.println("Bike avg: "+average);
			System.out.println("Bike weight: "+weight);
			System.out.println("Running KM: "+r_km);
			super.displayTwowheeler();
		}
	} 
	class Car extends Fourwheeler{
		int capacity,run_km;
		String owner_name;
		Car(String brand, String colour, String dealer, int v_regno, String v_engtype, int v_cost, int capacity, int run_km, String owner_name) {
			super(brand, colour, dealer, v_regno, v_engtype, v_cost);
			this.capacity=capacity;
			this.owner_name=owner_name;
			this.run_km=run_km;
		}
		public void displayCar() {
			System.out.println("Car owner name: "+owner_name);
			System.out.println("Capacity of the car: "+capacity);
			System.out.println("Running km of car: "+ run_km);
			super.displayFourwheeler();
		}
		
	}

