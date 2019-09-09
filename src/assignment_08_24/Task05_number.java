package assignment_08_24;

public class Task05_number {
	public static void main(String[] args) {
		
		//  number to be positive ; number> 0
		// number to be negative ;number<0
		// number to be zero == zero
		
		int num = 100;
		String str ="zero";
		
		if (num > 0) {
			str = "positive";
			System.out.println(num +  " is " +  str);
		}
		
		if (num < 0 ) {
			str = "negative";
			System.out.println(num +  " is " +  str);
			
		}
		
				
	}

}
