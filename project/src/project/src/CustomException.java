

public class CustomException  {
	public  static void number(int number1) {
		  if(number1==20)
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
				number(20);
			}

		}



}

	