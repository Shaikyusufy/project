package project;

public class MergSort {
	public static void main(String[] args) {
		MergSort obj = new MergSort();
		

		int[] arr = { 9,8,7,6,5,4,3,2,1 };
		
		obj.sort(arr,0, arr.length-1);
		obj.printArray(arr);
		
	}
	

	void printArray(int[] arr) {
		System.out.println("Elements are sorted");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void merge(int[] arr, int left, int mid, int right) {
		
		int n1 = mid-left+1;
		int n2 = right - mid;
		
		int L[] = new int[n1];
		int R[]	= new int[n2];
		
		for(int i=0; i<n1; i++) {
			L[i] = arr[left+i];
		}
		
		for(int j=0; j<n2; j++) {
			R[j] = arr[mid+j+1];
		}
		
		int i=0; 
		int j=0;
		int k = left;
		
		while(i < n1 && j < n2) {
			if(L[i] < R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k++] = L[i++];
		}
		
		while(j<n2) {
			arr[k++] = R[j++];
		}
		
		
	}
	
	void sort(int[] arr, int l, int r) {
		
		if(l < r) {
			int m= (l+(r-1))/2;
			
			sort(arr, l, m);
			sort(arr, m+1,r );
			
			merge(arr, l, m, r);
		}
	}

}
