package project;

public class Synchronization extends Object{
	void Table(int n) 
	{
		synchronized(this)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(n*i);
				try {
				Thread.sleep(1000);
			}
				catch(InterruptedException  e)
				{
					e.printStackTrace();				}
			}
		}
	}
}

class print implements Runnable{
	Synchronization s;
	public print(Synchronization s) {
		this.s=s;
	}
	public void run() {
		s.Table(6);
	}	
	
}
class launch{
	public static void main(String[] args)
	{
		Synchronization f=new Synchronization();
		 print p=new print(f);
		 Thread t1=new Thread(p);
		 t1.start();
	}
}

