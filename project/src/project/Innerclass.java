package project;

public class Innerclass {
	class b{
		void main() {
			System.out.println("nested class");
		}
	}
}
class launch1{
	public static void main(String[] args)
	{
		Innerclass.b k=new Innerclass(). new b();
		k.main();
	}
}


}
