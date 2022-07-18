package com.scalar.array.subarrays;

public class FindSubarrays {
	/*
	 * Given an array find the all the subarrays
	 * */
	public static void main(String[] args) {
		
		int[] arr = {2, -1, 3, 1};
		getSubarrays(arr);
		// TC : O(n^3) => It cannot be optimized
		
	}
	
	private static void getSubarrays(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j< arr.length; j++) {				
				System.out.print("["+i+", "+j+"] => ");
				System.out.print("{ ");
				for(int k = i; k < j+1; k++) {
					System.out.print(arr[k]+" ");
				}
				System.out.print("}");
				System.out.println("");
			}
		}
	}

}
