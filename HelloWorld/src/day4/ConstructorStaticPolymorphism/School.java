package day4.ConstructorStaticPolymorphism;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1= new Student();
		s1.studentDetailDisplay();
		Student s2= new Student("shravani",24,80,79,90);
		s2.studentDetailDisplay();
	}

}
