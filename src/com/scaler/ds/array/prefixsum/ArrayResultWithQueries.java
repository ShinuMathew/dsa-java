package com.scaler.ds.array.prefixsum;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayResultWithQueries {

	/**
	 * Given an array of length N such that each arr[i] = 0 initially. 
	 * Return the final array after performing all queries
	 * Queries (i, x) --> Add x to all numbers from i to N-1 
	 */
	public static void main(String[] args) {
		int[] arr = {0, 0, 0, 0, 0, 0, 0};
		int[][] queries = {{1, 3}, {4, -2}, {3, 1}};
		int[] result = executeQueries(queries, arr);
		Arrays.stream(result).boxed().collect(Collectors.toList()).forEach(System.out::println);
	}
	
	private static int[] executeQueries(int[][] queries, int[] arr) {
		for(int q = 0; q < queries.length; q++) {
			int i = queries[q][0];
			int x = queries[q][1];
			arr[i] += x;
		}
		
		int[] psArr = new int[arr.length];
		psArr[0] = arr[0];
		for(int i = 1; i < arr.length; i++) {
			psArr[i] = psArr[i-1] + arr[i];
		}
		return psArr;
	}	
	
	
}
