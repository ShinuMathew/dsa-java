package com.scaler.algo.hashing;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Given an array of N elements, calculate no. of distinct elements in every
 * subarray of size k ex : arr[] = {2, 4, 3, 8, 3, 9, 4, 9, 4, 10} k : 4
 */
public class FindDistinctElementsInSubarray {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 3, 8, 3, 9, 4, 9, 4, 10, 12, 4, 17, 4, 2, 2, 4, 3, 8, 3, 9, 4, 9, 4, 10, 12, 4, 17, 4, 2, 2, 4, 3, 8, 3, 9, 4, 9, 4, 10, 12, 4, 17, 4, 2, 2, 4, 3, 8, 3, 9, 4, 9, 4, 10, 12, 4, 17, 4, 2, 2, 4, 3, 8, 3, 9, 4, 9, 4, 10, 12, 4, 17, 4, 2 };
		
		long bruteStart = System.nanoTime();
		bruteForceSolution(arr, 4);
		long bruteEnd = System.nanoTime();
		System.out.println("Brute end : "+ (bruteEnd - bruteStart));
		System.out.println("====================");
		long optimStart = System.nanoTime();
		optimisedSolution(arr, 4);
		long optimEnd = System.nanoTime();
		System.out.println("Optimised end : "+ (optimEnd - optimStart));
	}

	static void bruteForceSolution(int[] arr, int k) {
		// no. of subarrays = (no. of elements in the array - size of subarray + 1) = 10
		// - 4 + 1 = 7
		for (int i = 0; i < arr.length - k + 1; i++) {
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int j = i; j <= i + k - 1; j++) {
				hs.add(arr[j]);
			}
			int size = hs.size();
			System.out.println(String.format("[%d , %d] : %d", i, i + k - 1, size));
		}
	}

	// Use Hashmap with occurrences
	static void optimisedSolution(int[] arr, int k) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int j = 0; j < k; j++) {

			if (hm.containsKey(arr[j])) {
				int occ = hm.get(arr[j]);
				hm.put(arr[j], occ + 1);
			} else {
				hm.put(arr[j], 1);
			}
		}
		int size = hm.size();
		System.out.println(String.format("[%d , %d] : %d", 0, k - 1, size));

		int s = 1;
		int e = k;

		while (e < arr.length) {
			// Add arr[e]
			if (hm.containsKey(arr[e])) {
				int occ = hm.get(arr[e]);
				hm.put(arr[e], occ + 1);
			} else {
				hm.put(arr[e], 1);
			}

			// remove arr[s-1]
			if (hm.get(arr[s - 1]) == 1) {
				hm.remove(arr[s - 1]);
			} else {
				int occ = hm.get(arr[s - 1]);
				hm.put(arr[s - 1], occ - 1);
			}

			size = hm.size();
			System.out.println(String.format("[%d , %d] : %d", s, e, size));
			s = s + 1;
			e = e + 1;
		}

//		for (int i = 1; i < arr.length - k + 1; i++) {
//
//			// add arr[i + k -1]
//			if (hm.containsKey(arr[i + k - 1])) {
//				int occ = hm.get(arr[i + k - 1]);
//				hm.put(arr[i + k - 1], occ + 1);
//			} else {
//				hm.put(arr[i + k - 1], 1);
//			}
//
//			// remove arr[i-1]
//			if (hm.get(arr[i - 1]) == 1) {
//				hm.remove(arr[i - 1]);
//			} else {
//				int occ = hm.get(arr[i - 1]);
//				hm.put(arr[i - 1], occ - 1);
//			}
//
//			size = hm.size();
//			System.out.println(String.format("[%d , %d] : %d", i, i + k - 1, size));
//		}
	}

}
