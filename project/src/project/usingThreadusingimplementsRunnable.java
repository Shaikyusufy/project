package project;

public class usingThreadusingimplementsRunnable extends Thread implements Runnable {


		// TODO Auto-generated method stub
public void run() {
	
	System.out.println("thread is running");
}
public void run1()
{
	System.out.println("implements runnable");
}
public static void main(String[] args) {
	//this two line of code for first method
	usingThreadusingimplementsRunnable v=new usingThreadusingimplementsRunnable();
	v.start();
	//this  lines of code for second method
	usingThreadusingimplementsRunnable b=new usingThreadusingimplementsRunnable();
	Thread t=new Thread(b);
	t.start();
	
	}

}
