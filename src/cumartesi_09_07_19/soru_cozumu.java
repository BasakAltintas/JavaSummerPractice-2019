
 package cumartesi_09_07_19;


import java.util.Locale;
import java.util.Scanner;

public class soru_cozumu {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		/*
		 System.out.println("bir sayi giriniz");
		 	int a = scan.nextInt();
		
		System.out.println("a variablenin degeri 23 oldu");
		 */
	
//=======================================================================
	
		
		/*
		 System.out.println("Enter your name : ");
		 
		String YourName = scan.next();
		
		System.out.println("your name is : " + YourName);
		 ;
	
		 */
//==================================================================
		/*
		 System.out.println("enter your first name");
		 String a = scan.nextLine();
	
	System.out.println("enter your last name");
	String l = scan.nextLine();
	
	System.out.println("Your first name : " + a);
	System.out.println("Your last name : " + l);
		 */
//========================================================================		
		
		int bakiye = 1000;
		int islem;
		
		
		// yapilacak islemleri aslinda Sout ile yapiyoruz.
		
		System.out.println("1. bakiye goruntule"); 
		System.out.println("2. Para yatirma"); 
		System.out.println ("3. Para cekme"); 
		System.out.println("4.Sistemden cikis"); 

		islem = scan.nextInt();
		
		switch (islem) {
		
		case 1: // islemin 1 olma durumunda (bakiye goruntule)
			System.out.println("Bakiye :" + bakiye + "TL'dir.");
			break;
			
		case 2: // islemin 2 olmasi durumunda Para yatirma.
			System.out.println("Ne kadar para yatiracaksiniz?");// bunun icin kullanicidan input almam lazim.
			int miktar = scan.nextInt(); // input almak icin once int variable olusturmam lazim.
			break;
			
			//bu durumda adam para yatirinca bakiye ,iktari degisecek ve onu gostermem lazim.
			bakiye = bakiye + miktar; 
			// yada su sekilde de yazabilirim
			//bakiye += miktar;
			System.out.println("Bakiyeniz " + bakiye + "TL'dir.");
			break;
			
		case 3 : // bu durumda da para cekilecek
			System.out.println("Ne kadar para cekeceksiniz?"); // bunun icin kullanicidan input almama lazim.
			int CekMiktar = scan.nextInt();
			
			// bu durumda bakiyede tekrar degisiklikler olacak.
			bakiye = bakiye - miktar;
			
			System.out.println("Bakinezde kalan miktar : " + CekMiktar + "TL'dir.");
			break;
			
		case 4 : // sistemden cikis durumu.
			System.out.println("Sistemden cikiliyor.");
		break;
		
		default:
		System.out.println("Gecersiz islem.");
			
			
			
			
		}
	
		
	}

}
