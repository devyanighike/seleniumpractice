package Negative_testScripts;

public class Exception_test {
	public static void main(String[] args) {
	

	int a = 0;
	int b=20;
	int c= a/b;

	 try  
     {  
		 System.out.print(c);
		 
     } 
	 catch(ArithmeticException e)  
     {   
         System.out.println("its an expcetion");  
     }  
	 catch(Exception e)  
     {   
         System.out.println("its an expcetion");  
     }  
	 
	 
     //handling the exception  
     
	}
 }
