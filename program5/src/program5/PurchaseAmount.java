package program5;

import java.util.Scanner;

public class PurchaseAmount {
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("discount is applicable");
		}
		else {
			System.out.println("discount not applicable");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter purchase amount");
	    double purchaseAmount=sc.nextDouble();
		checkDiscount(purchaseAmount);
	}

}
