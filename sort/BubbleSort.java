/**
 * This class implements BubbleSort on an array of integers. 
 * @author anupkhadka
 */

package sort; 

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int [] arr) {
		int tmp;
		for(int j = arr.length - 1; j > 0; j--) {
			for(int i = 0; i < j; i++) {
				if(arr[i] > arr[i+1]) {
					tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}
			}
		} 
	}	

	public static void main(String [] args) {
		int [] arr = {9,3,1,5,23,1000,3,2,766,2,7,7,99};
		System.out.println("Array before bubble sort	: " + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Array after bubble sort		: " + Arrays.toString(arr));
	}
}
