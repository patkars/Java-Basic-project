package Day2Assignment;
import java.util.Scanner;
public class SwitchCaseGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Score:");
		int score = sc.nextInt();
		sc.close();
		
	      String grade = null;
		switch(score/10) {
        
        case 10:
        case 9:
           grade = "A";
           break;
        
        case 8:
           grade = "B";
           break;
        
        case 7:
           grade = "C";
           break;
        
        case 6:
           grade = "D";
           break;
       
        case 5:
           grade = "E";
           break;
       
        default:
           grade = "F";
           break;
      }
      
      // display result
      System.out.println("Grade = " + grade);
	}

}
