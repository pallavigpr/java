package program8;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character ");
		char ch=sc.next().charAt(0);
		identifyCharacter(ch);
	    sc.close();
	}
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch)) {
			System.out.println(ch+" is a digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println(ch+" is a special character");
		}else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println(ch+" is a lower case vowel");
				}else {
					System.out.println(ch+" is upper case vowel");
				}
				break;
			default:if(Character.isLowerCase(ch)) {
				System.out.println(ch+" is a lower case consonant");
			}else {
				System.out.println(ch+" is Upper case consonant");
			}
			}
		}
	}

}
