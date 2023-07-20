package factorial;
import java.util.Scanner;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("enter n value ");
		int n=sc.nextInt();
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		System.out.println("factorail of n is "+res);

	}

}
