package day_10_If_Statement;

public class if_elseStatements {
	public static void main(String[] args) {
		
		/*
		 if =====> block is executed when the condition is true.
		 else =====> block is executed when the condition is false
		 */
		
		if (9>8) {
			System.out.println("9 is greater than 8");
		}
		
		if (9==8) {
			System.out.println( "9 is egual to 8");
		}
		
		if (9>=8) {
			System.out.println("9 is greater than or equal to 8");
		}
		
		if (9<8) {
			System.out.println("9 is smaller than 8");
		}
		
		else {
			System.out.println("9 is greater than 8");
		}
		
		// if 9 is greater or equal to 8 then 9 must be less than 8 
		
		if (false == !false) {
			// false boolean expression
			System.out.println("if block");
		}
		
		int score = 99;
		if (score >=60) {
			System.out.println("passed");
			
		}else {
			System.out.println("failed");
		}
		
		
		
		
			
		
	}

}
