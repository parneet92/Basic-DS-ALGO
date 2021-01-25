package basicDS;


import java.util.Scanner;

public class SelectionSort {

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
		int[] sortedValues = selectionSort(a);
		System.out.println("Sorted Values : ");
		for(int n : sortedValues) {
			System.out.println(n);
		}

	}

	public static int[] selectionSort(int[] a) {
		
		int len = a.length;
		int temp = 0;
		
		for(int i = 0 ; i < len ; i++) {
			for( int j = i+1 ; j < len ; j++ ) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];;
					a[j] = temp;
				}
			}
		}
		return a;
	}

}
