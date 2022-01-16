import java.util.Scanner;
public class calculatorprogram {
		
		

		
			public static void main(String []args)
			{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first element :");
		int a=scan.nextInt();
		System.out.print("Enter the second element  :");
		int b=scan.nextInt();
		System.out.println("enter the symbols");
		String z=scan.next();
		int result;
		switch(z) {
		case"+":result=a+b;
				System.out.print("for Adittion"+result);
			break;
			case"_":result=a-b;
			System.out.print("for subraction"+result);
		break;
			case"*":result=a*b;
			System.out.print("for multiplication"+result);
		break;
			case"/":result=a/b;
			System.out.print("for  division"+result);
		break;
		default:
		System.out.println("number not valid");
			}
		}
		}

}
