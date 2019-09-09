package day08_ShortHandOperators;

public class relationalOperators {
	
	public static void main(String[] args) {
		
		/*
		 
		 > : greater than
		 >=:greater or equal
		 < : smaller
		 <= : smaller or equal
		 ==: equal
		 !=:not equal
		 ! : Not
		 
		 */
		System.out.println(10>9);
		
		boolean ResultB = 10>9; // greater than
		System.out.println(ResultB);
		
		boolean resultC = 10<= 9;
		System.out.println(resultC); // less than or equal
		
		boolean B = !true;
		System.out.println(B); // false
		
		
		boolean F = 10> 9 == 9 <10; 
		// true == true ====> true
		System.out.println(F);
		
		String str3 = "result A " + 7 * 2 ; // Result A 14 we can do mutiplication
														// we can do also %
		
		// But we cannot do subtruction and addition in string
		
		boolean E = true && true || false;
		//			true		||	false;
		
		
		
	}

}
