package com.Question4;

import java.util.Arrays;


public class BubbleSort extends SortingAlgorithm{

	@Override
	void MyName() {
		System.out.println("I am Bubble Sort");
		
	}
	
	
	private void swap(int[] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(int[] arr, int n) {
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < arr.length - i -1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr,i,j+1);
				}
			}
		}
	
		System.out.println(Arrays.toString(arr));
		
	}

	
}
