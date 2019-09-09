package Day_15;

public class Scanner {

			//nested if
	public static void main(String[] args) {
		
		int hourOfDay = 22;
		
		if (hourOfDay < 12) {
			System.out.println("Say good morning");
			
		}else {
			
			if (hourOfDay < 17) {
			System.out.println("good afternoon");
			
		}else {
			System.out.println("Good evening");
		}
	}
	//==================================================================================
	
		int typeSelection = 1;
		int drinkSelection = 1;
		
		double price;
		
		if (typeSelection ==1) {
			System.out.println("Hot Drinks, 1 for tea, 2 for coffee");
			
		if (drinkSelection==1) {
			price = 2.0;
			String drink = "tea";
			
		}else if (drinkSelection == 2){
			
		}else {
			System.out.println("invalid hot drink selection!");
		}
			
		}else if (typeSelection ==1) {
			System.out.println("cold Drinks, 1 Iced tea, 2 Lemonade");
			
		if (drinkSelection==1) {
			price = 3.2;
			String drink = "Iced tea";
			
		}else if (drinkSelection == 2){
			price = 3.5;
			String drink = "Lemonade";
			
		}else {
			System.out.println("invalid cold drink selection!");
		
			
		}
			
		}
		
	//======================================================================================
		int n1 =15, n2=10;
		int max;
		
		max = (n1>n2) ? n1 : n2;
		
		System.out.println(max);

	//======================================================================================
		
	String action;
	boolean isGreen = true;
	
	action = (isGreen) ? "Can drive " : "Cannot drive" ;
	
	System.out.println(action);
	
	//=====================================================================================
	
	// if-else construct:
	
	int bill = 2000;
	int discount;
	
	if (bill > 2000) {
	discount =15;
	
	}else {
		discount = 10;
		
		System.out.println(discount);
		
		// aynisinnin terrinary sekli:
		
	discount = (bill > 2000) ? 15 : 10;
	
	System.out.println(discount);
	}
//=========================================================================================
	
	/*
	 int bill2 = 2000;
	 int qty = 10;
	int discount2 = 10;
	
	if (bill2 > 1000) {
		System.out.println(discount2);
		
	if (qty > 11) {
		System.out.println(discount2);
		
	} else if(discount2 == 9) {
		System.out.println(discount2);
		
	}else if (discount2 == 5){
		System.out.println(discount2);
	}
			
	}
	 */
	
	
	// bunu aynen su sekilde yazdilar
	
	/* bu bolum asagidaki ile ayni.
	  int bill2 = 2000;
	  int qty = 10;
	  
//	  discount = (bill>1000)? (qty >11) 10 :9 : 5;
	 */
	
	int bill2 = 2000;
	int qty = 10;
	
	if (bill>1000) {
		if (qty >11) {
			discount = 11;
			
		}else {
			discount= 9;
		}
	}else {
		discount =5;
	}
		discount =(bill > 1000) ? (qty > 11) ? 10 :9: 5;
		System.out.println(discount);
		
//=============================================================================================
		// in switch statement we can use char,byte, short, int, byte, string.
		int restaurantRating = 5; // as a char we can use 'A'
		switch (restaurantRating) {
		
		case 1: // for char can be case'A'
			System.out.println("this restaurant is not my favourite one");
			break;
			
		case 2:// case 'B'
			System.out.println("this restaurant is good");
			break;
			
		case 3: //case 'C'
			System.out.println("this restaurant is fantastic");
			break;
			
			default: //optional
				System.out.println("i have never dined at this restaurant");
				break;	
		}
		
		int num = 1;
		switch(num) {
		
		case 4 :
			System.out.println("One");
			break;
			
		case 5 :
			System.out.println("Two");
			break; 
			
		default:
			System.out.println("no number");
			break;		
		}
//=====================================================================================================
	
		
		
		
	}
}



