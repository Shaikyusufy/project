package project;

public class usingWAITandSLEEP {
static Object LOCK=new Object();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//Thread.sleep(1000);
for(int i=0;i<5;i++)
{
	Thread.sleep(1000);

	System.out.println( i);

}
System.out.println(Thread.currentThread().getName() );
synchronized (LOCK){
	LOCK.wait(1000);
	System.out.println(LOCK);
}
	}

}
