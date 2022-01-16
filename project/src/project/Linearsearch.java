package project;

import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y[]= {2,1,8,3,9,6,22};
		int temp=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter the number");
		while(true)
		{
		int num=scan.nextInt();
		for(int i=0;i<y.length;i++)
		{
			if(y[i]==num)
				
			{
				System.out.println("number is founf  "  +i+  "index position");
				temp=temp+1;
			}
		
			
		}
if(temp==0)
{
	System.out.println("number is not found"+num);
}
	}
	
	}
}


