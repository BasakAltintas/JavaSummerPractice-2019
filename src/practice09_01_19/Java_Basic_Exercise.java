package practice09_01_19;

public class Java_Basic_Exercise {
	public static void main(String[] args) {
		
	// 1)
		String str = "hello";
		System.out.println(str);
		System.out.println("Basak Altintas");
		
	/*
	  2) Write a Java program to print the sum of two numbers. Go to the editor
	  Test Data: 
			74 + 36 
			Expected Output :
			110
	 */
		int i = 74;
		int n = 36;
		
		System.out.println(74 + 36); //110
		System.out.println(i + n); //110
		
		/*
		3)  Write a Java program to divide two numbers and print on the screen. 
        Test Data : 
        50/3
        Expected Output :16
		 */
		
		int in = 50;
		int tin = 3;
		
		System.out.println(in / tin);
		System.out.println(50 / 3);
		
		/*
		 4) Write a Java program to print the result of the following operations. 
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9 
c. 20 + -3*5 / 8 
d. 5 + 15 / 3 * 2 - 8 % 3 
Expected Output :
43 
1 
19 
13
		 */
		int a = -5 + 8 * 6;
		int b = (55 + 9)%9;
		int c = 20 + -3 * 5 /8;
		int d = 5+15/3*2-8%3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	//=================================== ikinci yol:
		
		 System.out.println(-5 + 8 * 6);
		  System.out.println((55+9) % 9);
		  System.out.println(20 + -3*5 / 8);
		  System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		  /*
		   5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
		   */
		  int x = 25;
		  int y = 5;
		   System.out.println(x*y);
		  
		   
		   /*
		    6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
		    */
		   int e= 125;
		   int f = 24;
		   
		   System.out.println(e + f);
		   System.out.println(e - f);
		   System.out.println(e * f);
		   System.out.println(e / f);
		   System.out.println(e % f);
		   
		   /*
		    8.) Write a Java program to display the following pattern. Go to the editor
Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 
		    */
		   
	System.out.println("   j    a   v     v  a   ");
	System.out.println("   j   a a   v   v  a a  ");
	System.out.println("j  j  aaaaa   v v  aaaaa ");
	System.out.println(" jj  a     a   v  a     a");


	/*9) Write a Java program that takes three numbers as input 
	to calculate and print the average of the numbers.
	 */
		   int g = 10;
		   int h = 20;
		   int k = 30;
		   int top = (g+h+k);
		   int average = (top/3);
		    System.out.println(average);
		    
//===========================================================================>
		    
		    /*
		  11.) Write a Java program to check 
		  whether Java is installed on your computer. 

		     */
		    String v = "1.8.0_71";
		    String Rv = "1.8.0_71-b15";
		    String Jh = "/opt/jdk/jdk1.8.0_71/jre";
		    String Jv = "Oracle Corporation";
		    String URL = "http; //Java.oracle.com/";
		    String JCP = ".";
		    
		    System.out.println("Java version: " + v);
		    System.out.println("Java run time version: " + Rv);
		    System.out.println("Java home: " + Jh);
		    System.out.println("Java vendor: " + Jv);
		    System.out.println("Java Vendor URL: " + URL );
		    System.out.println("Java Class Path: " + JCP);
		    
//=============================================================================>
		    
		    /*
		    12.) Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 3
		     */
		    
		    int first = 25;
		    int second = 39;
		    
		    System.out.println("First input is: " + first);
		    System.out.println("Second input is: " + second);
		    
		    System.out.println(first > second); // false
		    System.out.println(first != second); // true
		    System.out.println(second < first); // false
		    
		    System.out.println("25<39"); // 25<39
		    System.out.println(25<39); // true
//==============================================================================
		    
		    
		   
		    String password = "abc@123";
		    
		    System.out.println("your password was: " + password);
		    
//=================================================================================		    
		  /*
		13.)   Write a Java program to print the following string in a specific format (see the output). Go to the editor
Sample Output

Twinkle, twinkle, little star,
	How I wonder what you are! 
		Up above the world so high,   		
		Like a diamond in the sky. 
Twinkle, twinkle, little star, 
	How I wonder what you are  
		   */
	 
		    String tw = "Twinkle, twinkle, little star";
		    String hw ="How I wonder what you are!";
		    String Up = "Up above the world so high,";
		    String Li = "Like a diamond in the sky.";
		    String twi = "Twinkle, twinkle, little star,";
		    String ho ="How I wonder what you are";
		    
		    System.out.println(tw);
		    System.out.println("    " + hw);
		    System.out.println("        " + Up);
		    System.out.println("        " + Li);
		    System.out.println(twi);
		    System.out.println("    " + ho);
//====================================================================================		 
		  /*
		   Write a Java program that accepts three integers from the user 
		   and return true if the second number is greater than first number
		    and third number is greater than second number. If "abc" is true 
		    second number does not need to be greater than first number. Go to the editor
Sample Output:

Input the first number : 5                                             
Input the second number: 10                                            
Input the third number : 15                                            
The result is:  10                                            
Input the third number : 15                                            
The result is: true
		   */
		    
		    int num1 = 5;
		    int num2 = 10;
		    int num3 = 15;
		    
		    if (num2 > num1) {
		    System.out.println("input  the first number: " + num1);
		    }
		    
		    if (num3> num2) {
		   System.out.println("Input the second number: " + num2);
		    }
		    
		   if (num2>num1 && num3>num2) {
		   System.out.println("Input the third number " + num3);
		   
		   }else {
			   System.out.println("False");
		   }
//=========================================================================================
		   
		   
		   
		   
		   
		   
				  
		
	}
}
