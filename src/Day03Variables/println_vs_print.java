package Day03Variables;

public class println_vs_print {
	
	//in java we cannot use space just use _ or $
	
	public static void main(String[] args) {
		
		System.out.println("Hello Cybertek"); // prints from new line
		System.out.println("School");  // println her yazdiginda takes place from next line.
		
		System.out.println("======================");
		
		System.out.print("Hello Cybertek");
		System.out.println("School");	// print ise satirbasi yaptirmiyor. printing 
		
		System.out.println("Today is");
		System.out.print(" great day"); // birisi println digeri print olunca no matter what println yine de ayri satirlara yazdirir. 
	}

}
