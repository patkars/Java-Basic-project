package day3;

public class Employee {
	String emp_name;
	int emp_id, emp_basic_sal;
	float emp_hra, emp_da, emp_gross ;
	
	public void getDetails(String s, int a, int b ) {
		emp_name = s;
		emp_id = a;
		emp_basic_sal =b;
		System.out.println("Employee details intialized");
	}
	public void displayDetails() {
		System.out.println("Employee name :"+emp_name);
		System.out.println("Employee id :"+emp_id);
		System.out.println("Employee Basic Salary :"+emp_basic_sal);
		calHraDaGross();
		System.out.println("Hra Details :"+emp_hra);
		System.out.println("Da Details :"+emp_da);
		System.out.println("Employee Gross Salary Detail :"+emp_gross);
	}
	public void calHraDaGross() {
		if (emp_basic_sal<=10000) {
			emp_hra = (emp_basic_sal*20)/100;
			emp_da= (emp_basic_sal*30)/100;
		}else if (emp_basic_sal<=20000) {
			emp_hra = (emp_basic_sal*25)/100;
			emp_da= (emp_basic_sal*35)/100;
		}else if (emp_basic_sal<=30000) {
			emp_hra = (emp_basic_sal*30)/100;
			emp_da= (emp_basic_sal*40)/100;
		}
		emp_gross= emp_basic_sal+emp_hra+emp_da;
	}
}
