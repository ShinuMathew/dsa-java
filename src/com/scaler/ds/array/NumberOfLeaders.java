package com.scaler.ds.array;

public class NumberOfLeaders {
	
	/**
	 * Given an arr[N], you have to find all the leaders in arr[].
	 * An element is a leader if it is greater than the max of all the elements on its entire right.
	 * NOTE : arr[N-1] is always a leader.
 	 * */
	public static void main(String[] args) {
		
		int[] arr = { 8, -2, 4, 7, 6, 5, 1 };
		System.out.println(carryForwardSolution (arr));
	}
	
	private static int carryForwardSolution(int[] arr) {
		int count = 1;
		int prevLeader = arr[arr.length-1];
		for(int i = arr.length-2; i >= 0; i--) {
			if(arr[i] > prevLeader) {
				prevLeader = arr[i];
				count++;
			}
		}
		return count;
	}

}
