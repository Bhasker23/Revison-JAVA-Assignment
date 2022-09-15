package com.Question4;

import java.util.Arrays;

public class SortingRunner {
	
	public static void main(String[] args) {
		
		int[] arr = {3,5,0,8,9};
		int n = arr.length;
		
		System.out.println("Original Array ->  "+ Arrays.toString(arr));
		System.out.println("________________________");
		BubbleSort bSort  = new BubbleSort();
		
		bSort.MyName();
		bSort.sort(arr,n);
		System.out.println("________________________");
		
		SelectionSort sSort = new SelectionSort();
		sSort.MyName();
		sSort.sort(arr, n);
		System.out.println("________________________");
		
		InsertionSort iSort = new InsertionSort();
		iSort.MyName();
		iSort.sort(arr, n);
	}
}
