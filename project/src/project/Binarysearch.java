package project;

public class Binarysearch {
	public static void main(String[] args) {
		int a[]= {2,5,6,9,12,14,16,18,19,22};
		int seac=22;
		int li=0;
		int hi=a.length-1;
		int mi=(li+hi)/2;
		
		
		while(li<=hi)
		{
		if(a[mi]==seac)
		{
			System.out.println("number "+mi+"    index value");
			break;
		}
		else if(a[mi]<seac)
		{
			li=mi+1;
		}else
		{
			hi=mi-1;
		}
		mi=(li+hi)/2;
		}
		if(li>hi)
		{
			System.out.println("element not found");
		}
	}



}
