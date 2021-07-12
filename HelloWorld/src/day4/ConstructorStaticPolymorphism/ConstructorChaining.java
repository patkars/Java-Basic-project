package day4.ConstructorStaticPolymorphism;

public class ConstructorChaining {
	String emp_name;
	int emp_id, emp_basic_sal;
	
	public ConstructorChaining(String emp_name,int emp_id, int emp_basic_sal) {
		//this(20);
		this.emp_name=emp_name;
		this.emp_id=emp_id;
		this.emp_basic_sal=emp_basic_sal;
		System.out.println("in paramertric constructor");
		
	}
	/*public ConstructorChaining(int emp_id,int emp_basic_sal) {
		this("Shravani", emp_id, emp_basic_sal);
	}*/
	public ConstructorChaining(String name,int id) {
		this(name ,id, 50000);
	}
	public ConstructorChaining() {
		this("Shruti",27);
	}
	
	public void displayDetails() {
		System.out.println("Employee name :"+emp_name);
		System.out.println("Employee id :"+emp_id);
		System.out.println("Employee Basic Salary :"+emp_basic_sal);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChaining cc1=new ConstructorChaining();
		cc1.displayDetails();
	}

}
