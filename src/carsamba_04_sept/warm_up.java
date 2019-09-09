package carsamba_04_sept;

public class warm_up {   // SWITCH STATEMENT
/*
 Write a program that can display the days 
 	
 	if the day is Monday or Tuesday:
 			Java class days.
 			
 	if the day is Thursday or Friday:
 			Selenium class days 
 			
 	if the day is Wednesday or Saturday
 			SQL class days.
 			
 		otherwise: day off
 	
 	(do not use if statement.)
 	
 */
	public static void main(String[] args) {
		// boolean, float, double and long are not accepted by SWITCH STATEMENT.
		
		String day = "Tuesday"; // I am choosing the day randomly.
		
		switch (day) { // I need to pass the variable.
		// what do I have in Switch Statement = case and Default
		
		case "Monday" : //I need to give here String value because it should be match with the Switch statement expression (day).
			System.out.println("Jaca Class");
			break; // I need to put break here because it keeps executing untill the other break.
			
		case "Tuesday" :
			System.out.println("Java class");
			break;
			
		case "Wednesday":
			System.out.println("SQL class");
			break;
			
		case "Thursday":
			System.out.println("Selenium class");
			break;
			
		case "Friday":
			System.out.println ("Selenium class");
			break;
			
		case "Saturday":
			System.out.println("SQL class");
			break;
			
			default:
				System.out.println("Day off");
			// i don't have break because } means break.
		}
		
		
	}
}
