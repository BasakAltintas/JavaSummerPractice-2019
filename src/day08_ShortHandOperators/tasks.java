package day08_ShortHandOperators;

public class tasks {
	
	public static void main(String[] args) {
	
		// Task 1:
		
		int FirstNum = 40;
		int Secondnum = 20;
		
		boolean Num = FirstNum > Secondnum;
		System.out.println(Num);
	
//==============================	
		
		// Task 2:
		
		int Applescount = 20;
		int orangecount = 30;
		int pearscount = 30;
		
		boolean Count = Applescount < orangecount || orangecount>= pearscount;
//								true			||			true
//											true		
		
		System.out.println(Count); // true
	
		//==============================	
		
		// Task 3 :

		String outsideweather = "shiny";
		int degree = 70;
		 boolean Count2 = ( !(outsideweather == "Rainy" || degree == 70));
// 										false					true
//												 !(true)========> false
		 System.out.println(Count2);

		//==============================	 
		 
		 // Task 4:
		 
		 int b = 2;
		 boolean res = ++b == 2 || --b == 2 && -- b == 2 ;
		 //            3 == 2	||	1 == 2 &&   1  == 2
		 //				false	||	false  &&   false
		 // false
		 System.out.println(res);
		 
		//==============================
		 
		 // Task 5:
		 
		 boolean x = true , z = true;
		 int y = 20;
		 x = (y != 10) || (z = false);
		//     true    ||    false
		// true
		  System.out.println(x);
		  
		//==============================		  
		  
		// Task 6:
		  
		  
		  
		 
		
	}

}
