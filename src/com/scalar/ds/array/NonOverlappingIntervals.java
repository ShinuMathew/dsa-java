package com.scalar.ds.array;

public class NonOverlappingIntervals {

	/**
	 * Given a sorted list of overlapping intervals [s, e](s<=e), sorted based on
	 * the start time(s). Merge all overlapping intervals & return a sorted list of
	 * non overlapping intervals s = {0, 1, 5, 6, 7, 8, 12 ,13} e = {2, 4, 6, 8, 10,
	 * 9, 14, 15}
	 */
	public static void main(String[] args) {
		int[] s = { 0, 1, 5, 6, 7, 8, 12, 13 };
		int[] e = { 2, 4, 6, 8, 10, 9, 14, 15 };
		print(s, e);
	}

	private static void print(int[] s, int[] e) {
		int x = s[0];
		int y = e[0];
		for (int i = 1; i < s.length; i++) {
			if (y >= s[i]) {
				y = Math.max(y, e[i]);
			} else {
				System.out.println(x + ", " + y);
				x = s[i];
				y = e[i];
			}
		}
		System.out.println(x + ", " + y);
	}
}
