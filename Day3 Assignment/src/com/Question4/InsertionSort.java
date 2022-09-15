package com.Question4;

import java.util.Arrays;

public class InsertionSort extends SortingAlgorithm {

	@Override
	void MyName() {
		System.out.println("I am an Insertion Sort");
		
	}
	
	public void sort(int[] arr, int n) {
		
	     for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	     
	     System.out.println(Arrays.toString(arr));
	}

	
}
