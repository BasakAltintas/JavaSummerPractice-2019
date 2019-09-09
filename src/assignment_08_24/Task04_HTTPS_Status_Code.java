package assignment_08_24;

public class Task04_HTTPS_Status_Code {
	public static void main(String[] args) {
		
		int statusCode = 200, s2=201, s3=202, s4=301, s5=303, s6=304;
		int s7=307, s8=400, s9=401, s10=403, s11=404, s12=410, s13=500, s14=503;
			
		 if (statusCode == 200) {
			 System.out.println("OK");
		 }
		 
		 if (s2==201) {
			 System.out.println("Created");
		 }
		 
		 if (s3==202) {
			 System.out.println("Accepted");
		 }
		 if (s4==301) {
			 System.out.println("Moved Permanently");
		 }
		 
		 if (s5==303) {
			 System.out.println("See Other");
		 }
		 if (s6==304) {
			 System.out.println("Not Modified");
		 }
		 
		 if (s7==307) {
			 System.out.println("Temporary Redirect");
		 }
		 
		 if (s8==400) {
			 System.out.println("Bad Request");
		 }
		 
		 if (s9==401) {
			 System.out.println("Unauthorized");
		 }
		 
		 if (s10==403) {
			 System.out.println("Forbidden");
		 }
		 
		 if (s11==404) {
			 System.out.println("Not Found");
		 }
		 
		 if (s12==410) {
			 System.out.println("Gone");
		 }
		 
		 if (s13==500) {
			 System.out.println("Internal Server Error");
		 }
		 
		 if (s14==503) {
			 System.out.println("Service Unavailable");
		 }
	}

}
