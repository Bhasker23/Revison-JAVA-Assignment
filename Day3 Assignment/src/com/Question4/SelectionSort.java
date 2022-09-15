package com.Question4;

import java.util.Arrays;

public class SelectionSort extends SortingAlgorithm{

	@Override
	void MyName() {
		System.out.println("I am Selection Sort");
	}
	
	private void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public void sort(int[] arr, int n) {
		
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					swap(arr, i, min);
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
