package project;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		int a=5;
		int b=0;
		int c=a/b;// TODO Auto-generated method stub
try {
	System.out.println(c);
}
catch(ArithmeticException  e){
	e.getMessage();
}
	}

}
