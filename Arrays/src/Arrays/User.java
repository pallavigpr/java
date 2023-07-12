package Arrays;
import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter people count");
		int a=sc.nextInt();
		Boolean arr[]=new Boolean[a];
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("is person "+i+" married?");
			arr[i]=sc.nextBoolean();
		}
		System.out.println("array contents are");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("person "+i+" married "+arr[i]);
		}

	}

}
