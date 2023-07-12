package calculator;
import java.util.Scanner;
public class CaluculatorApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Calculator calculator=new Calculator();
		while(true){
		System.out.println("hello user welcome to kodnest calculator");
			System.out.println("+ ===> addition");
			System.out.println("- ===> subtraction");
			System.out.println("* ===> multiplication");
			System.out.println("/ ===> division");
			System.out.println("% ===> remainder");
			System.out.println("^ ===> square");
			System.out.println(" enter your choice");
			char ch=sc.next().charAt(0);
		switch(ch){
			case '+':calculator.addition();
			         break;
			case '-':calculator.subtraction();
	                 break;
			case '*':calculator.multiplication();
	                 break;
			case '/':calculator.division();
	                 break;
			case '%':calculator.remainder();
	                 break;
			case '^':calculator.square();
	                 break;
			case '!':System.out.println("tata tata bye bye");
				     return;
			default:System.out.println("go to vaasan eye care and check your eyes see the message properly");

	}

}}
}