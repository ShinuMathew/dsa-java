package com.scalar.ds.array;

public class RainWaterTrapped {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 0, 3, 5, 2, 1, 7, 3 };
		printArr(arr);
		System.out.println("");
		printArr(getPrefixMaxArray(arr));
		System.out.println("");
		printArr(getSuffixMaxArray(arr));
		System.out.println("");
		System.out.println(findTotalRainWaterTapped(arr));
	}
	
	private static int findTotalRainWaterTapped(int[] arr) {
		/**
		 * APPROACH :
		 * - For a given element
		 * 1. Get the max height on the left(Lmax) using Prefix Max Array and on right(Rmax) using Suffix Max Array.
		 * 2. Find the minimum of Lmax and Rmax(WLi)
		 * 3. Get the difference between height if the ith element and WLi. This will be the water tapped over a single wall(Wi)
		 * - Get the Wi for all the walls and find the sum
		 */
		int[] Pmax = getPrefixMaxArray(arr);
		int[] Smax = getSuffixMaxArray(arr);
		int sum = 0;
		for(int i = 1; i< arr.length - 1; i++) {
			// i starts from 1 to n-2 because there cannot be any water tapped on the first and the last wall
			int Lmax = Pmax[i-1];
			int Rmax = Smax[i+1];
			int WLi = Math.min(Lmax, Rmax);
			if(WLi > arr[i]) {
				sum += WLi - arr[i];
			}
		}
		return sum;
	}

	private static int[] getPrefixMaxArray(int[] arr) {
		int[] Pmax = new int[arr.length];

		Pmax[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			Pmax[i] = Math.max(arr[i], Pmax[i - 1]);
		}
		return Pmax;
	}

	private static int[] getSuffixMaxArray(int[] arr) {
		int n = arr.length;
		int[] Smax = new int[n];
		
		Smax[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			Smax[i] = Math.max(Smax[i + 1], arr[i]);
		}
		return Smax;
	}
	
	private static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
