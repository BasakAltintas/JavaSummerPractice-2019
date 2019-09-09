package day06_ArithmeticOperator;

public class PrimitiveCasting {
	 /*
	  casting: converting larger primitive to smaller size.
	  datatype variable = (datatype) value
	  
	  castings are either explicit and implicit.
	  Implicit casting : 
	  
	  primitive: byte, short,int,long,float,double.
	  
	  */
 public static void main(String[] args) {
	int a = 10;
	byte b =  (byte) a; // explicit casting
	
	double decimalNum= 10.5;
	float floatNum = (float) decimalNum;
	System.out.println(floatNum);
	
	long longNum = 300l;
	int intNum = (int) longNum;
	int intNum2 = (short) longNum;
	
	System.out.println(intNum);
	System.out.println(intNum2);
	
//Implicit Casting
	byte byteNum = 100;
	int IntNum = byteNum;
	
	int IntNum1 = (int) byteNum; // same with that we have learned so far.
	System.out.println( IntNum1);
	
	short ShortNum1 =100;
	long LongNum1 = ShortNum1;
	// same with :
	long longNum3 = (long) ShortNum1;
	
	float floatNumber = 500.67f;
	
	int myNumber = (short) floatNumber;
	System.out.println(myNumber); //500
	
	int myNumbeer = (int) floatNumber;

	boolean result; // bu henuz initialized olmamis.
	//LOCAL VARIABLES MUST BE DEFINED BEFORE USED, MUST BE INITIALIZED. INITIALIZNG MEANS MUST HAVE VALUE.
	
	
	
	
}

}