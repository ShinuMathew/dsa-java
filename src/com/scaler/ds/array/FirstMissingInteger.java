package com.scaler.ds.array;

import java.util.Arrays;
import java.util.HashSet;

public class FirstMissingInteger {

	/**
	 * Given an array of integer, find the first missing positive integer from the
	 * array. Ex : {8, 10, 1, -3, 2, -5} Ans : 3
	 * 
	 */
	public static void main(String[] args) {
//		int[] arr = {8, 10, 1, 3, -3, 2, -5};
		int[] arr = {8, 10, 2, 1, -1, 2, 8, 7, 9};
		System.out.println(findFirstMissingIntBFWithSort(arr));
		System.out.println(findFirstMissingIntBFWithHashing(arr));
		System.out.println(findFirstMissingIntSendHomeTechnique(arr));
		System.out.println(findFirstMissingIntSendHomeTechniqueBetterWay(arr));
	}

	private static int findFirstMissingIntBFWithSort(int[] arr) {
		// Sort the array and iterate to find the first missing +ve integer
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count += 1;
				if (arr[i] != count) {
					return count;
				}
			}
		}
		return count;
	}
	
	private static int findFirstMissingIntBFWithHashing(int[] arr) {
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i = 0; i < arr.length ; i++) {
			if(arr[i] > 0) {
				hs.add(arr[i]);
			}
		}
		
		for(int i = 1; i < arr.length ; i++) {
			if(!hs.contains(i)) {
				return i;
			}
		}
		return arr.length + 1;
	}
	
	private static int findFirstMissingIntSendHomeTechnique(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if(arr[i] > 0 && arr[i] <= n) {
				int temp = arr[i];
				if(arr[temp-1] != arr[i]) {	// ignoring duplicate values
					arr[i] = arr[temp-1];
					arr[temp-1] = temp;
					i--;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != i+1) {
				return i+1;
			}
		}
		return n+1;
	}
	
	private static int findFirstMissingIntSendHomeTechniqueBetterWay(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			if(arr[i] <= i || arr[i] > n || arr[arr[i] - 1] == arr[i] || arr[i] == i+1)	continue;
			else {
				int temp = arr[i];
				arr[i] = arr[temp-1];
				arr[temp-1] = temp;
				i--;
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(arr[i] != i+1) {
				return i+1;
			}
		}
		return n+1;
	}

}
