package com.kodnest.traning.program;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter sides");
		int sides=sc.nextInt();
		identifyPolygon(sides);
	}
	public static void identifyPolygon(int sides) {
		if(sides==3) {
			System.out.println("traiangle");
		}
		else if(sides==4) {
			System.out.println("Quadrilateral");
		}
		else if(sides==5) {
			System.out.println("pentagon");
		}
		else{
			System.out.println("hexagon");
		}
	}

}
