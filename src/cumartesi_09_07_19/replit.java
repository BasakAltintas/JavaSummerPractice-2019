package cumartesi_09_07_19;

import java.util.Scanner;

public class replit {
	
	private static String fulln;
	private static double height;
	private static String adress;
	private static String contacts;
	private static Scanner scan;
	private static double grade1;
	private static String subject1;
	private static Scanner scan2;
	private static String subject2;
	private static String subject3;
	private static String subject4;
	private static String subject5;
	private static String summary;
	private static double grade2;
	private static double grade3;
	private static double grade4;
	private static double grade5;
	private static double avarage;

	public static void main(String[] args) {
		
	 	
		/* System.out.println("What are you going to learn?");
		
		String a = scan.next();
		String J = "a";
		
		System.out.println("What is the next");
		
		String S = "s";
		String s = scan.next();
		
		System.out.println("You will learn " + a + " and " + S + " in Cybertek School.");
		
	 */
	//	============================================================================================


/*
 Scanner scan = new Scanner (System.in);
		
    
		System.out.println("Enter a number");
			 int num1 = scan.nextInt();
			 System.out.println("You have entered : " + num1);
			 
			 System.out.println("Enter the second number");
			 int num2 = scan.nextInt();
			 System.out.println("You have entered : " + num2);

			 System.out.println("Enter the third number");
			 int num3 = scan.nextInt();
			 System.out.println("You have entered : " + num3);
			 
			 System.out.println("You will see the total" + (num1 + num2 + num3) );
   
    
 */
//===============================================================================================
    
		/*
		 Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your grade");
		int grade = scan.nextInt();
		
		if (grade >90) {
			System.out.println("excellent");
			
		}else if(grade >70 && grade < 90) {
			System.out.println("Good");
			
		}else if (grade >60 && grade < 70) {
			System.out.println("pass");
			
		}else if (grade < 60) {
			System.out.println("Fail");
		}
		 */
//==================================================================================================
		/*
		 Scanner scan = new Scanner (System.in);
		int n1 = 9;
		int n2 = 1;
		int n3 = 1;
		
		if (n1 > n2 && n1>3) {
			System.out.println("n1 is the biggest");
		}
		
		else if (n2 >n1 && n2>n3) {
			System.out.println("n2 is the biggest");
		}
		
		else if (n3 > n1 && n3> n2) {
			System.out.println("n3 is the biggest");
		}	
		 */
		
	//==================================================================================================	
		/*
		 	
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds. 

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
		 	
		 					// CEVAP
		 	
Write a program that outputs the number of hours, minutes, and seconds that
corresponds to input total seconds. 

-create a Scanner object
- declare int variables inputSeconds, hours, minutes, seconds
-Ask user enter seconds by printing:
"Enter seconds:"

-Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
-Assign values to the hours, minutes, seconds variables
-Display the result.

Example run:
Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
		 	
		 	// ANSWER
		 	
		Scanner scan = new Scanner (System.in);
			 
			  System.out.println("Enter seconds : ");
			  int second = scan.nextInt();
			  System.out.println("Enter seconds : " + second);
			  
			  int hours = (second/60)/60;
			  //System.out.println(hours+" .hours");
			  int minutes = (second/60)%60;
			  //System.out.println(minutes+" .minutes");
			  
			  second= (second%60);
			  //System.out.println(second+" .seconds"); 
			  
			  System.out.println(hours + " .hours, " + minutes + " .minutes, " + second + " .seconds.");
		 */
//===================================================================================================			
			  
/*
ask the user for his name, capture it on a string using scanner.

then output the length of the name string.
 */
		
								//CEVAP
		/*
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter your name");
		 String name = scan.next();
		
		 System.out.println("The length of " + name + " is " + name.length ());
		 
		 */
//=====================================================================================================
		/*
		 Instructions from your teacher:
In this assignment you will write a program to create a shopping list and prices.

You will use Scanner object and ask user to enter 3 items followed by its price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Create a Scanner object named scan.

Execution flow with example:

-Display prompt "Enter Item1 and its price:"
Tomatoes
5.5

-Display prompt "Enter Item2 and its price:"
Cheese
3.5

-Display prompt "Enter Item3 and its price:"
Apples
6.3

-calculate totalPrice for all items

-build the report variable by concatenating Strings and double values: 

"Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3"
"Total price: 15.3"

		 */
									//ANSWER
	
		 
		
		/*
		 	Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter Item1 and its price:");
		String item1 = scan.next();
		double price1 = scan.nextDouble();
		//System.out.println("You have " + item1 + " and its price: " + price1);
		
		System.out.println("Enter Item2 and its price:");	
		String item2 = scan.next();
		double price2 = scan.nextDouble();
		
		System.out.println("Enter Item3 and its price:");
		String item3 = scan.next();
		double price3 = scan.nextDouble();
		
		System.out.println("Enter Item4 and its price:");
		String item4 = scan.next();
		double price4 = scan.nextDouble();
		
		System.out.println("In your chart you have: " + item1 + ", "+ item2+ ", " + item3 + ", " + item4 +".");
		 System.out.println ("Total payment is: " + (price1 + price2 + price3 + price4));
		
		 Tomatoes
		 1.99
		 
		 Oninon
		 1.49
		 
		 Cucumber
		 3.49
		 
		 Patotoes
		 0.99
	
		 */
//=========================================================================================================		
/*
 Instructions from your teacher:


Declare 9 String variables firstName, lastName, fullName, email, street, state, city, address, contacts.
Declare 2 int variables: age, zipcode
Declare 2 double variables: height, weight.
Declare boolean variable: isMarried (for marriage status).
Declare 2 long variables: workPhoneNumber and personalPhoneNumber.

-Create a Scanner object named scan.

Execution flow with example:
-Display prompt "Welcome to the patient portal!"
-Display prompt "Please enter your personal information"

-Display prompt "Enter your first name"
James

-Display prompt "Enter your last name"
May

-Display prompt "Enter your email"
jamesmay@gmail.com

-Display prompt "Enter your street"
7925 Jones Branch Dr

-Display prompt "Enter your city"
McLean

-Display prompt "Enter your state"
VA

-Display prompt "Enter your zip code"
22102

-Display prompt "Enter your work phone number"
7896542314

-Display prompt "Enter your personal phone number"
2406542314

-Display prompt "Enter your age"
35

-Display prompt "Enter your height"
5.10

-Display prompt "Enter your weight"
173.2

-Display prompt "Are you married?"
true



-build contacts variable by concatenating work phone, personal phone and email
-build fullName variable by concatenating first name and last name
-build address variable by concatenating street, city, state, zip code

//this is should be an output in the console (terminal)

Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true
 */
			 	//									 ANSWER
		
		/*
		 	scan = new Scanner (System.in);
	
	System.out.println("Welcome to the patient portal!");
	System.out.println("Please enter your personal information");
	
	
	System.out.println("Enter your first name");
	String fn = scan.nextLine();
	
	System.out.println("Enter your last name");
	String Ln = scan.nextLine();
	
	
	System.out.println("Enter your full name");
	fulln = scan.nextLine();
	
	System.out.println("Enter your email");
	String email = scan.nextLine();
	
	System.out.println("Enter your street");
	String street = scan.nextLine();
	
	System.out.println("Enter your state");
	String state = scan.nextLine();
	
	System.out.println("Enter your city");
	String city = scan.nextLine();
	
	System.out.println("Enter your adress");
	adress = scan.nextLine();
	
	System.out.println("Enter your Contacts");
	contacts = scan.nextLine();
	
	System.out.println("Enter your age");
	int age = scan.nextInt();
	
	System.out.println("Enter your zipcode");
	int zip = scan.nextInt();
	
	System.out.println("Enter your work phone number");
	long wp = scan.nextLong();
	
	System.out.println("Enter your personal phone number");
	long pp = scan.nextLong();
	
	System.out.println("Enter your weight");
	double weight = scan.nextDouble();
	
	System.out.println("Enter your height");
	height = scan.nextDouble();
	
	System.out.println("Are you married?");
	boolean marriage = scan.hasNext();
	
	System.out.println("Patient personal information");
	System.out.println("Full name: " + fn + " " + Ln);
	System.out.println("Adress: " + street + ", " + city + ", " + state + ", " + zip);
	System.out.println("Contacts: work phone number - " + wp + ", personal phone number - " + pp + "email: " + email );
	System.out.println("Age: " + age);
	System.out.println("Weight: " + weight);
	System.out.println("Married?: " + marriage);
		 */
		
//====================================================================================================
	
		/*
		 Write the program that will calculate average grade.
Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;
Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;

-Create a Scanner object named scan.
		 */
		//									ANSWER
		
		/*
		 scan2 = new Scanner (System.in);
		
		System.out.println("Welcome to the Grader!");
		
		System.out.println("Please enter subject name number 1 and score for this subject");
		subject1 = scan2.nextLine();
		grade1 = scan2.nextDouble();
		
		System.out.println("Please enter subject name number 2 and score for this subject");
		subject2 = scan2.nextLine();
		grade2 = scan2.nextDouble();
		
		System.out.println("Please enter subject name number 3 and score for this subject");
		subject3 = scan2.nextLine();
		grade3 = scan2.nextDouble();
		
		System.out.println("Please enter subject name number 4 and score for this subject");
		subject4 = scan2.nextLine();
		grade4 = scan2.nextDouble();
		
		System.out.println("Please enter subject name number 5 and score for this subject");
		subject5 = scan2.nextLine();
		grade5 = scan2.nextDouble();
		
		//System.out.println("Please enter subject name number 1 and score for this subject");
		//summary = scan2.nextLine();
		//average = scan2.nextDouble();
		
		System.out.println("Summary: " + subject1 + "-" + grade1 + ", " + subject2 + "-" +grade2 + ", " + subject3 + "-" +grade3 + ", " + subject4 + "-" + grade4 + ", " + subject5 + "-" + grade5);
		System.out.println("Your average score is: " + ((grade1 +grade2+grade3+grade4+grade5)/5) );
		System.out.println("Thank you for using Grader!");
		System.out.println("Goodbye!");
		
		 */
//======================================================================================================================		
		
	/*
	   Declare int variables: seniorCitizens, nonSeniorCitizens, age
-Create a Scanner object
- Ask user to enter count for seniorCitizens and nonSeniorCitizens using message:
"Enter current count for seniorCitizens and nonSeniorCitizens:"

-Ask user to enter age:
"What is new citizen's age?"

-if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

-if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

-At last, print another message:
"New seniorCitizens count ValueOfVariable"
"New nonSeniorCitizens count ValueOfVariable"

	 */
		//										ANSWER
		
		Scanner scan = new Scanner (System.in);
		
		
		
		
		
		
 }
	
}
	
 