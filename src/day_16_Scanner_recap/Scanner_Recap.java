package day_16_Scanner_recap;

import java.util.Scanner; // import from one class
//import java.util.*; // import from all classes from java.util

public class Scanner_Recap {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("enterb your first name and last name");
		
		String firstName = scan.nextLine().toUpperCase();
		String lastName = scan.nextLine().toUpperCase();
		
		String fullName = firstName+ " " +lastName;
		
		System.out.println("Your full name is : " + fullName);
		
//=============================================================================================
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter your phone number");
		int phonemun = scan.nextInt() ;
		
		
		
	}

}
