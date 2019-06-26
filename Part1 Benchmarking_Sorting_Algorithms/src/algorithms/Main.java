/**
 * Kudzanai gomera
 */
package algorithms;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Main ob = new Main();

		int numbers[] = new int[1000000]; // declaring an array and setting a constant size
		int digits[] = numbers;
		
		random(numbers); // calling the random function that generates random values for the 
		System.out.println("\n");
		System.out.println("------------------------firstArray-----------------------------------");
		long start = System.currentTimeMillis(); // time fnc making the start of the array sort
		ob.selectionSort(numbers); // sorting the array 
		//System.out.println("\n");
		//System.out.println("sorted aaray.....");
		//ob.printArray(numbers);
		System.out.println();
		long end = System.currentTimeMillis(); // marking the end of the array
		System.out.println("the array  with selectionSort took " + (end - start) + " ms"); //time calculatio
		System.out.println();
		
		System.out.println("---------------------------Second array -----------------------------");
		long st = System.currentTimeMillis(); // making the start of the array sort 
		Arrays.sort(digits); // sorting the array using built in fnc
		System.out.println();
		//System.out.println("\n");
		//System.out.println("Sorted array...");
		//ob.printArray(digits);
		long en = System.currentTimeMillis(); // making the end of the sort
		System.out.println("the array  with builtin sort took " + (en - st) + " ms"); // doing the time calculation
	}
	
	//this fnc sorts the array
	void selectionSort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
	
	//this array prints out the generated integers
	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
			System.out.println();
	}
	
	// this fnc generates random integers to the array
	public static void random(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Integer.MAX_VALUE * Math.random());
		}
		for (int j = 0; j < arr.length; ++j) {
			//System.out.print(arr[j] + " ");
			
		}

	}
}
