package project;

public class Exceptionhandlings {
	  public static void main(String[] args) {
		    try {
		      
		      int divideByZero = 5 / 0;
		    }

		    catch (ArithmeticException e) {
		      System.out.println(  e.getMessage());
		      System.out.println("-------------");
		      System.out.println(e.toString());
		      System.out.println("-------------");

		    }
		    
		    finally {
		      System.out.println("This is the finally block");
		    }
		  }
}
