package controle;

import java.util.Scanner;

public class Switch1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inform the student's grade: ");
		String grade = sc.nextLine().toUpperCase();
		
		String gpa = ""; sc.close();
		
		switch(grade){
		case "A":
			gpa = "4";
			break;
		case "B":
			gpa = "3";
			break;
		case "C":
			gpa = "2";
			break;
		case "D":
			gpa = "1";
			break;
		case "F":
			gpa = "0";
			break;
		default:
			gpa = "invalid value!";
		}
		System.out.println("The student's GPA is " +gpa);
		
	}
}
