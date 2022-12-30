package Test;



public class Demo {
public static void main(String[]args) { // main method body
		
		
		// Starting point of the program
		
		System.out.println("main method started");
		
		// Direct calling by method name
		
		//Syntax - Methodname();
		      
		      m1();
		      m2();
		      
		//Calling by class name
		      
		      //Syntax -Classname.methodname();
		      
		      Demo.m1();
		      Demo.m2();
		      
		      System.out.println("main method endend");
		
		      }
	
	      public static void m1() {
	    	  
	    	  System.out.println("static method calling from the same class:m1");
	    	  
	      }
	      
	      public static void m2() {
	    	  
	    	  System.out.println("static method calling from the same class:m2");
	    	  
	      }

}
