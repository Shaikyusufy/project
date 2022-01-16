package project;

public class InsertionSort {
public static void main(String []args)
{
	InsertionSort obj = new InsertionSort();

	int[] arr = { 4, 8, 39, 2, 12, 3, 5, 7, 1 };

	obj.insertionSort(arr);
	obj.printingArray(arr);

}


  void printingArray(int[] arr) { for (int i = 0; i < arr.length; i++) {
  System.out.println(arr[i] + " "); 
}
  }
 

public void insertionSort(int[] arr) {

	for (int i = 1; i < arr.length; i++) {

		int pickedElement = arr[i];

		int j = i - 1;

		while (j >= 0 && arr[j] > pickedElement) {
			arr[j + 1] = arr[j];
			j--;
		}

		arr[j + 1] = pickedElement;

	}
}
}
