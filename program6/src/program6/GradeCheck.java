package program6;
import java.util.Scanner;
public class GradeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int grade=sc.nextInt();
		checkGrade(grade);
		

	}
	public static void checkGrade(int grade) {
		if(grade>50) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
