package com.kodnest.traning.programs;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter age");		
            int age=sc.nextInt();
            categorizeAge(age);
	}
	public static void categorizeAge(int age) {
		if(age>0 & age<13) {
			System.out.println("child");
		}
		else if(age>=13 & age<20){
			System.out.println("Teen");
		}
		else if(age>=20 & age<60){
			System.out.println("Adult");
		}
		else {
			System.out.println("Senior");
		}
	}

}
