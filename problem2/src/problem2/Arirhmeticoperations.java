package problem2;

public class Arirhmeticoperations {
	public static void main(String []args) {
		int sub=subtractNumbers(20,5);
		System.out.println(sub);
		int multiply=multiplyNumbers(4,5);
		System.out.println(multiply);
		double division=divideNumbers(20,4);
		System.out.println(division);
		int remainder=findRemainder(10,3);
		System.out.println(remainder);
		
	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}

}
