
public class UsingFinally {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=7;
		int y=2;
		int i=x/y;
	try {
		 
System.out.println(i);
			
	}
	
	catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	finally{
		System.out.println("finally will Execute always");
	}
	}
}
	

