package com.scaler.ds.array.subarrays;

public class MaxSubarraySumOfLength {
	
	public static void main(String[] args) {
		
		int[] arr = { -3, 4, -2, 5, 3, -2, 8, 2, -1, 4 };
//		int max = getMaxSubarraySumRevised(arr, 5);
//		int max = optimisedSolutionPrefixSum(arr, 5);		
		int max = slidingWindowSolution(arr, 5);
		System.out.println("max : "+max);
	}
	

	private static int getMaxSubarraySumRevised(int[] arr, int k) {
		int max = Integer.MIN_VALUE;
		int s = 0, e = k;
		int n = arr.length;
		while(e < n) {
			int sum = 0;
			for(int i = s; i < e; i++) {
				sum += arr[i];
			}
			s++;
			e++;
			max = max > sum ? max : sum;
		}
		return max;
	}
	
	private static int slidingWindowSolution(int[] arr, int k) {
		int sum = 0;
		for(int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int ans = sum;
		
		int s = 1, e = k;
		int n = arr.length;
		while(e < n) {
			sum = sum - arr[s-1] + arr[e];
			ans = ans > sum ? ans : sum;
			s++; e++;
		}
		return ans;		
	}

	private static int optimisedSolutionPrefixSum(int[] arr, int k) {
		// Optimise the calculation of sum using Prefix sum		
		int[] PSArr = createPrefixSum(arr);
		int max = Integer.MIN_VALUE;
		int s = 0, e = k;
		int n = arr.length;
		while(e < n) {
			int sum = PSArr[e] - (s == 0 ? 0 : PSArr[s-1]);
			max = max > sum ? max : sum;
			s++;
			e++;
		}
		return max;
	}
	
	static int[] createPrefixSum(int[] arr) {
		int[] PSArr = new int[arr.length];
		PSArr[0] = arr[0];
		for(int i = 1; i < arr.length; i++) {
			PSArr[i] = PSArr[i-1] + arr[i];
		}
		return PSArr;
	}
}
