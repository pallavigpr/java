package Arrays;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        float arr[]=new float[7];
        System.out.println("enter array elements");
        for(int i=0;i<=arr.length-1;i++) {
        	System.out.println("enter height of player "+i);
        	arr[i]=sc.nextFloat();
        }
        
        for(int i=0;i<=arr.length-1;i++) {
        	
        	System.out.print(arr[i]+" ");
        }
	}

}
