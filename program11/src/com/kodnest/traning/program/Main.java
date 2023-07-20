package com.kodnest.traning.program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter product Code like p01....");
		String code=sc.next();
		getProduct(code);

	}
	public static void getProduct(String productCode) {
		switch(productCode){
			case "p01" : System.out.println("coco cola");
			            break;
			case "p02" : System.out.println("pepsi");
			            break;
			case "p03" : System.out.println("thumsup");
                         break;
			default:System.out.println("sprite");
			
		}
	}
	

}
