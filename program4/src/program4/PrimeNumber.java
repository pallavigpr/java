package program4;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
	    for(int i=2;i<n;i++){
			if(n%i==0) {
				System.out.println("number is not a prime");
			    return;
			}
		}
		System.out.println("is a prime");


	}

}
