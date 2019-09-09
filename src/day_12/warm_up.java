package day12_SwitchStatement;
public class warmUp {
    
    /*
     Warm up:
     declare 3 numbers
   if n1 and n2 are equal  => n1&n2 are equal
   
    if n2 and n3 are equal ==> n2&n3 are equal
    if n3 and n1 are qual ==>n3&n1 are equal
    if all equal ==> all equal
    if none of them are euqal ==> none of them are equal
        Do Not use single if statement
    
     */
    
    public static void main(String[] args) {
        
            int n1= 4, n2 = 1, n3 = 5;
            
            if(n1 == n2 && n1!=n3) {  // true
                System.out.println("n1 and n2 equal");
            }
            else if (n2 == n3 && n2 != n1) {
                System.out.println("n2 and n3 equal");
            } 
            else if (n3 == n1 && n1 != n2 ) {  
                System.out.println("n3 and n1 equal");
            }
            else if (n1 == n2 && n2 == n3 && n1 == n3 ) {
                System.out.println("all equal");
            }
            else {
                System.out.println("non equal");
            }
        System.out.println("\n\n");
    
    // second:
    int num1 =1 , num2 =2  , num3 = 9;
    
            
        if(num1==num2  &&  num2==num3 ) {
            System.out.println("all equal");
        }
        else if(num1 == num2){
            System.out.println("num1 and num2 are equal");
        } 
        else if(num2 == num3) {
            System.out.println("num2 and num3 are equal");
        }
        else if(num1 == num3 ) {
            System.out.println("num1 and num3 are equal");
        }
        else  {
            System.out.println("none of them are equal"); 
        } 
        
    
    // third: nested if
        int A =10, B=20, C=30;
    
    
        if(A==B && B == C) {  // if all are equal
            System.out.println("All are equal");  
            
        }
        else { // if not all of them are equal
            
            if(A == B) { // if A and B are qual
                System.out.println("A and B are equal");
            }
            else if(A ==C) { //if A and C are euqal
                System.out.println("A and C are equal");
            }
            else if(B == C) { // if B and C are equal
                System.out.println("B and C are equal");
            }
            else {// if none of them are equal
                System.out.println("None of them are equal");
            }   
        }
        
    
    
    
    
    
    
    }   
        
    



int num =9;

if(num++ == 10) {  // line 1

System.out.println("Hello World "+num);    // line 2

}

else {

System.out.println("Hello Universe "+num);  // line 3

}



