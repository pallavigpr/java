package program7;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter first num");
		int n=sc.nextInt();
		System.out.println("enter second num");
		int a=sc.nextInt();
		checkMultipleOfTen(n,a);

	}
	public static void checkMultipleOfTen(int n,int a) {
		if(n%a==0) {
			System.out.println("1st number "+n+" is multiple of "+a);
		}
		else {
			System.out.println("1st number "+n+" is not multiple of "+a);
		}
		
	}

}
