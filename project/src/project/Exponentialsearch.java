package project;
import java.util.Arrays;
import java.util.Scanner;
public class Exponentialsearch {



	

		public static void main(String[] args) {
			int[] a = { 8, 6, 2, 1, 4,7 };

			Scanner s = new Scanner(System.in);
			while (true) {
				System.out.println("Enter element to search:");
				int key = s.nextInt();
			
				int result = exponentialSearch(a, a.length, key);
				
				if(result <0) {
					System.out.println("Element not found ");
				} else {
					System.out.println( result);
				}
			}

		}	
		static int exponentialSearch(int[] a, int n, int x) {
			if(a[0] == x) {
				return 0;
			}	
			int i=1;
			while(i < n && a[i] <= x) {
				i = i*2;
			}		
			return Arrays.binarySearch(a, i/2, Math.min(i, n), x);	
		}

	}


