package com.scalar.basic;

/*
 * Given an arr[n], find all the leaders in the array.
 * An element is a leader, it is strictly greater than the max on its right side. arr[N-1] is always a leader
 * */
public class FindLeaders {
	
	public static void main(String[] args) {
		
		int[] arr = {15, -1, 7, 2, 5, 4, 2, 3};
		System.out.println(findLeaders(arr));
	}
	
	private static int findLeaders(int[] arr) {
		int leaderCount = 1;
		
		int max = arr[arr.length-1];		
		
		for(int i = arr.length-2; i>=0; i--) {
			if(arr[i] > max) {
				arr[i] = max;
				leaderCount++;
			}
		}
		return leaderCount;
	}

}
