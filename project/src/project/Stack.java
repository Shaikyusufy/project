package project;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk= new Stack<>();
		stk.push(78);  
		stk.push(113);  
		stk.push(90);  
		stk.push(120);  
System.out.println(stk);
String peek=stk.peek();
System.out.println(peek);
	}

}
