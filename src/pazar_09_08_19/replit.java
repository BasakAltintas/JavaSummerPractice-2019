package pazar_09_08_19;

import java.util.*;

public class replit {
	public static void main(String[] args) {
	
		/*
		 Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
		int SeniorCitizens = scan.nextInt();
		int nonSeniorCitizens = scan.nextInt();
		
		System.out.println("What is new citizen's age?");
		int age = scan.nextInt();
		
		if  (age > 65)  {
			++ SeniorCitizens ;
			System.out.println( "Senior Citizen");
		}else {
			++ nonSeniorCitizens;
			System.out.println( "Non-Senior Citizen" );
		}
		
		System.out.println("New senior citizens: " + SeniorCitizens);
		System.out.println("New nonsenior citizens: " + nonSeniorCitizens);
		
		 */
	//================================================================================
/*
 Write an expression using the conditional operator (? :) that compares the value of the variable x to 5 and results in:
Display x if x is greater than or equal to 5
Display -x if x is less than 5		
 */
//							ANSWER
	//======================================================
		
		/*
		 U have an Integer number already declared and assigned value.
		 Using Multi-Branch if statements, check if number is positive, 
		 negative or zero. Please follow the below examples and print message 
		 */
	//								ANSWER
		/*
		 Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int a = scan.nextInt();
		if (a>=0) {
			System.out.println(a + " is a positive number");
		}else if(a <= 0) {
			System.out.println(a + " is a negative number");
		}else {
			System.out.println(a + " is an invalid number");
		}
		
		System.out.println("Enter a number");
		int b = scan.nextInt();
		if (b>=0) {
			System.out.println(b + " is a positive number");
		}else if(b<= 0) {
			System.out.println(b + " is a negative number");
		}else {
			System.out.println(b + " is an invalid number");
		}
		
		
		System.out.println("Enter a number ");
		int c = scan.nextInt();
		if (c>=0) {
			System.out.println(c + " is a positive number");
		}else if(c<= 0) {
			System.out.println(c + " is a negative number");
		}else {
			System.out.println(c + " is an invalid number");
		}
		 */
	//========================================================================
		/*
 In this assignment you will write a program to create a 
 shopping list, count and prices.
Please read carefully! If you do not fully understand 
the requirement
 ask your classmates in Slack or ask your instructor!
You will use Scanner object and ask user
 to enter 3 items followed by its count, price and 
 you will calculate total price and show as a report.
		 */
//							ANSWER	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Item1, count and its price:");
		String item1 = scan.nextLine();
		
		int count1 = scan.nextInt();
		double price1 = scan.nextDouble();
		System.out.println("Item1 is " + item1 + ", " + "count is " + count1 + ", " + "price is " + price1);
		
		
		System.out.println("Enter Item2, count and its price:");
		String item2 = scan.nextLine();
		int count2 = scan.nextInt();
		double price2 = scan.nextDouble();
		System.out.println("Item2 is " + item2 + ", " + "count is " + count2 + ", " + "price is " + price2);
		
		
		System.out.println("Enter Item3, count and its price:");
		String item3 = scan.nextLine();
		
		int count3 = scan.nextInt();
		double price3 = scan.nextDouble();
		System.out.println("Item3 is " + item3 + ", " + "count is " + count3 + ", " + "price is " + price3);
		
		
		
	
		
		
		
		
		
		
		
		
		
	}
	
}
