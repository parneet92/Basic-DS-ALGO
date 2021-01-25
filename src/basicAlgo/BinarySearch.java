package basicAlgo;

import java.util.Scanner;

import basicDS.SelectionSort;

public class BinarySearch {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the no of val - ");
			int numberOfValues = sc.nextInt();
			int[] a = new int[numberOfValues];
			int i = 0;
			while(numberOfValues > 0) {
				a[i] = sc.nextInt();
				i++;
				numberOfValues--;
			}
			System.out.println("Number to search - ");
			int val = sc.nextInt();
			int foundValue = binarySearch(SelectionSort.selectionSort(a), val);
			System.out.println("Found Value - " + foundValue);
		}

	private static int binarySearch(int[] sorted, int val) {

		int startIndex = 0;
		int endIndex = sorted.length-1;
		int mid = 0;
		
		while( startIndex != endIndex ) {
			mid = (startIndex + endIndex) / 2;
			
			if( val == sorted[mid]) {
				return val;
			}
			
			if( val > sorted[mid]) {
				startIndex = mid + 1;
			}
			
			else {
				endIndex = mid - 1;
			}
		}
		
		if( val == sorted[startIndex]) {
			return val;
		}
		return -1;
	}



}
