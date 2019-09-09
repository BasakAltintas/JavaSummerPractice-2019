package day_5_Recap;

public class QUizes {
	
	public static void main(String[] args) {
		
	
	/*
	 * byte=merdivenAlti < int=bizimOda < short=cocuklarinOdasi < long=salon < float=bizim daire < double=bina
	
	multiple ways to declare main method:
                 1. public static void main(String[] args)
                 2. static public void main(String[] args)
                 3. public static void main(String...  args)
         
	 
	 */
		int i = 100;
		double d = 300l;
		float f = 200f;
		
		//i = f; // i<F     we are assigning float to int. = means not equal, it means assign
		
		/*
		 \n : brake a new line 
		 \t: horizantal tab (paragraph space)
		 \\ : prints a single slash
		 \' : single quote
		 \" : prints double quotes
		 */
		
		System.out.println("today is a great day \n Friday");
		System.out.println("\t today is a great day Friday");
		System.out.println("today is a great day \\ Friday");
		System.out.println("today is a great day \' Friday");
		System.out.println("today is a great day \" Friday");
		
	
		
		/*
		 PIRIMITIVES
		 byte: only take whole numbers.
		 short: only take whole numbers.
		 int: only take whole numbers.
		 long:only take whole numbers.
		 float: can take decimals, (Must have F or f)
		 double: can take decimals
		 boolean: True false
		 Char: take ' and single character also take numbers.
		 
		 
		 
		 short sNum2 = 1000; It can be complied.
		 short sNum2 = 126.5; short takes only whole numbers.
		 
		 
		 */
		
		

	}
	
	
}
package day05_Recap;
public class Primitives_Review {
    
    /*
        Primitives:
                byte: only takes whole numbers 
                short: only takes whole numbers
                int(used more often): only takes whole numbers
                long: only takes whole numbers
                
                float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
                
                boolean: true or false boolean expressions
                char: character within single quote ''
                        also takes number
                        
                        
     Range: double > float >long > int >short > byte
                
     */
    
        public static void main(String[] args) {
        
            
            
            
        //      System.out.println(bNum); 
                // java applications are executed from top to buttom
            
                byte bNum = 127;
            
                // byte range: -128 to 127
            
        //  byte bNum2 = 126.5; // byte only takes whole numbers
            
        
            short sNum2 = 1000;
        //  short sNum = 126.5;  // short only takes whole numbers
            
        //  bNum = sNum2;  // short is greater than byte
            
            sNum2 = bNum;  // sNum2 = 127;
            System.out.println(sNum2); // 127
            
            
            short sNum3 = 127;
        //  byte bNum5 = sNum3;  // shrot > byte
            
            
            
            int intNum = 100;
    //      int intNum2 = 100.5;   // int takes whole numbers only
            
            System.out.println(intNum);  // 100
            
    //      byte ByteNum = intNum; // int > byte
    //      short ShortNum = intNum; // int > short
            
            short ShortNum2 = 105;
            intNum = ShortNum2;   // intNum =105
            
            System.out.println(intNum); // 105
            
            
            
    // long:        
            
            long LongNum = 100l; 
            long LongNum2 = 100L;
            
        //  byte ByteNum3 = LongNum;
        //  short ShortNum4 = 100l;
        //  int IntNum3 = 100L;       long > int, byte, short
            
            byte a=10;
            int b=30; 
            short c = 40;
            
            long LongNumber = a;
            long LongNumber2 =b;
            long LongNumber3 = c;
            
    
            
    // float:
        
            float floatNumber = 10.5f;
            float floatNumber2 = 20.5F;
            
        short a1 =10;  byte b1=20;  long c1= 30;   int d1 = 40;
            
        float Floats =  a1;
        float Floats2 = b1;
        float Floats3 = c1;
        float Floats4 = d1;
        
        System.out.println( Floats ); // 10.0;
    
        
        
// double: takes all the whole and decimal numbers
        double DoubleNum1 = 10L; // long is smalelr than double
        
        double DoubleNum2 = 10.5F;
        
        
// boolean: 
            boolean result = true;
            boolean result2 = false;
            
            
    // char: 
            
            
            
            
            
            
        }
    
    
    
}