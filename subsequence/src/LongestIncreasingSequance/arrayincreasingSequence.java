package LongestIncreasingSequance;

import java.util.HashSet;

public class arrayincreasingSequence {

	public static void main(String[] args)
	{
		int arr[]= {3,91,14,100,4,21,2,22,33};
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		int long_seq=0;
		for(int i=0;i<arr.length;i++)
		{
			if(!set.contains(arr[i]-1))
			{
				int no=arr[i];
				while(set.contains(no))
				{
					no++;
				}
				if(long_seq<no-arr[i])
				{
					long_seq=no-arr[i];
				}
			}
		}
		System.out.println(long_seq);
	}
}
