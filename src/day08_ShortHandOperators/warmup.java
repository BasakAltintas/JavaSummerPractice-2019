package day08_ShortHandOperators;

public class warmup {
	
	/*
	 Task2: 
	 write a program that converts gallons to litters
	 1 gallon = 3.785 liters
	 */
	public static void main(String[] args) {
		
		int gallon = 100;
		double litters = gallon* 3.785; // converts gallon to litters
		
		System.out.println( gallon + " gallons equal to" + litters + litters);
		
		double L = 1;
		double G = L/ 3.785;
		
		System.out.println(L + " Litter eguals to " + G + " gallons");
		
		String result1 = gallon + " gallons equals to " + litters + " litters";
		
	}

}
