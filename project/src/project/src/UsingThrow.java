
public class UsingThrow {
	public  static void Checkage(int age) {
  if(age<20)
  {
	  throw  new ArithmeticException();
  }
  else
  {
	  System.out.println("you are old");
  }
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Checkage(10);
	}

}

