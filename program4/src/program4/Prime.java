package program4;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean isPrime=false;
		if(n<=2) {
			System.out.println("entered number "+n+" is  prime");
		}
		else {
			for(int i=2;i*i<=n;i++) {
				if(n%i!=0) {
					isPrime=true;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println("entered number "+n+" is prime");
			}
			else
			{
			  System.out.println("entered number "+n+" is not a prime");	
			}
		}
	}

}
