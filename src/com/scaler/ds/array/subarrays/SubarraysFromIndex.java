package com.scaler.ds.array.subarrays;

/**
 * Given an array get the subarray sum starting index 2
 * */
public class SubarraysFromIndex {

	public static void main(String[] args) {
		
		int[] arr = {7, 3, 2, -1, 6, 8, 2, 3};
		
		int sum = 0;
		
		for(int i = 2; i< arr.length; i++ ) {
			sum += arr[i];
			System.out.println("[2, "+i+"] : "+sum);
		}
	}
}
