package project;

public class Bubblesort {
	public static void main(String[] args) {
	int arr[]= {45,66,78,90,9};
	int temp=0;
	//this is for rounding
	for(int i=0;i<arr.length;i++)
	{
		int flag=0;
		//this line is for swapping b/w 2 elements
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0)
		{
			break;
		}
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}

}



}
