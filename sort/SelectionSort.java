/**
 * This class implements SelectionSort on an array of integers
 * @author anupkhadka
 */

package sort; 

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int [] arr) {
		int min, minIndex, tmp;
		for(int i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			min = arr[i]; 
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < min) {
					minIndex = j;
					min = arr[j];
				} 	
			}
			if(min != arr[i]) {
				tmp = arr[i];
				arr[i] = min;
				arr[minIndex] = tmp;
			}
		}
	} 
	
	public static void main(String [] args) {
		int [] arr = {9,3,1,5,23,1000,3,2,766,2,7,7,99};
		System.out.println("Array before bubble sort	: " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Array after bubble sort		: " + Arrays.toString(arr));
	}
}
