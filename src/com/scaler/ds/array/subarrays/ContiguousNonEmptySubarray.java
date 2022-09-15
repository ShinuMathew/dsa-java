package com.scaler.ds.array.subarrays;

/**
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product. Return the product
 * Ex : Input : [2, 3, -2, 4] Output : 6
 * Explanation: [2,3] has the highest product 6
 * */
public class ContiguousNonEmptySubarray {
	
	public static void main(String[] args) {
				
		int[] nums = {2, 3, 2, -4};
		System.out.println("Maximum product subarray is : "+getproduct(nums));	
		
	}
	
	private static int getproduct(int[] nums) {
		int lastProduct = 0 , currentproduct = 0, maxProduct = 0;
		
		for(int i = 0; i<nums.length-1; i++) {
			for(int j = i+1; j<nums.length; j++) {
				currentproduct = getProductOfArray(nums, i, j);				
				if(lastProduct == 0)
					lastProduct = currentproduct;				
				else {
					maxProduct = lastProduct > currentproduct ? lastProduct : currentproduct;
					lastProduct = maxProduct;
				}												
			}
		}
		return maxProduct;
	}
	
	private static int getProductOfArray(int[] nums, int startIndex, int endIndex) {		
		int product = 0;
		for(int i = startIndex; i<=endIndex; i++) {
			product = (product == 0) ? nums[i] : product * nums[i];			
		}
		return product;
	}

}
