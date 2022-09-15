package com.scaler.algo.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleSort {

	/**
	 * Given an array arr[] sort the array in ascending order using bubble sort
	 * */
	
	public static void main(String[] args) {
		
		int[] arr = {2, 11, -1, 6, 8, 3, 9, 4, 1, 8, 5};
		sort(arr);
	}
	
	private static void sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {	
				// Since bubble sort pushes the largest element to the end for each iteration,
				// Our loop end can avoid that hence arr.length - i - 1
															
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		// Arrays.asList(arr).forEach(System.out::println);	// List of primitive type wont work here
		Integer[] intArr = Arrays.stream(arr).boxed().toArray(Integer[]::new); 	// Convert primitive int to Integer array
		List<Integer> list1 = Arrays.asList(intArr);
		// OR
		List<Integer> list2 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		list2.forEach(System.out::println);
	}
}
