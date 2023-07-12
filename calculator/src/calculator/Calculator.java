package calculator;
import java.util.Scanner;
public class Calculator {
	Scanner sc=new Scanner(System.in);
	void addition() {
		System.out.println("enter two numbers for addition");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("addition of "+a+"and"+b+"is "+(a+b));
	}
	public void subtraction() {
		System.out.println("enter two numbers for subtraction");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("subtraction of "+a+"and"+b+"is "+(a-b));
	}
	public void multiplication() {
		System.out.println("enter two numbers for multiplication");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("multiplication of "+a+"and"+b+"is "+(a*b));
	}
	public void division() {
		System.out.println("enter two numbers for division");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("division of "+a+"and"+b+"is "+(a/b));
	}public void remainder() {
		System.out.println("enter two numbers for remainder");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("remainder of "+a+"and"+b+"is "+(a%b));
	}public void square() {
		System.out.println("enter a number for square");
		int a=sc.nextInt();
		System.out.println("square of "+a+" is "+(a*a));
	}

}
