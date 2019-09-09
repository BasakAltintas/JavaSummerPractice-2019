package day_4_Variables2;

public class PrimitiveDataTypes2 {
 /*
  Primitives: byte, short, int, long, float, double, boolean, char
  Boolean: boolean takes all boolean expressions and returns true or false. and returns either true or false.
  *Anything that can be returned as true or false, can be initialized to boolean
  
  */
	
	public static void main(String[] args) {
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 =9>3;
		
		// boolean result = earth is flat; java cannot assign these expressions. 
		// boolean = 100; boolean only takes true or false expressions
		
		
		System.out.println(result); // true
		System.out.println(result2); // false
		System.out.println(result3); //true
		
		/*
		 ASCII TABLE: all the codes (asciitable.com) alphabet of computer programming language.All language have their own alphabet. 
		 this is universal system, for computer programming. they all recognized by  all computers.each character in ASCII table have a corresponding number to represent it. 
		 
	 Char : declared within the single quote ''.single character only.
	 */
		char char1 = 'a';
		 System.out.println(char1);
		 
		 char char2 = '9';
		 char char3 = '#';
		 
		 // char with numbers
		 
		 char char4 = 67; // only time we use single quote when we are using single character.
		 // prints the character that's corresponding to 67 from ASCII Table
		 
		 System.out.println(char4);
		 
		 char char5 = 'C'; // prints the characters as it is 
		 char char6 = '{';
		 System.out.println(char6);
		 
		 char char7 = 123;
		 System.out.println(char7);
		 
		/*
		  Initializing char to the other primitives, can i initialize char to the int for example.
		  number that represents to that character  
		 */
		 
		 char myChar1 = 'b';
		 int MyInt = MyChar; // the number that represents b is initialized to the int
		 
		 System.out.println(MyInt); //98
		 
		 
		 
		 // short ShortNum = MyChar1; ==> char's memory is larger than short it gives error
		 
		 short ShortNum2 = 'b'; // b's corresponding number is 98 in ASCII table 
		 
		 System.out.println(shortnum2); //98
		 
		 long LongNum = MyChar1; // long's memory is 8bytes
		 long LongNum2 = 'b'; //98
		 System.out.println(LongNum2); //98
		 
		 float floatNum = MyChar1; // if it is more memory it can be assigned float to char
		 float floatNum2 = 'b';
		 
		 System.out.println(floatNum2); //98.0 decimal seklinde
		 
		 double doubleNum = MyChar1;
		 double doubleNum2= 'b';
		 System.out.println(doubleNum2);  //98.0 
		 
		 /*
		  Char value can be assigned 
		  */
		 
		 char MyCharTable = 36000;
		 System.out.println(MyCharTable);
		 
		 i=f;
		 
		 
		 
		 
		 
		 
		 
		 
				 
		
	}
}
