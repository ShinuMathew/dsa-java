package com.scaler.array.carryforward;

public class SwitchBulbs {

	/**
	 * A wire connects N light bulbs.
	 * Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
	 * Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
	 * You can press the same switch multiple times.
	 * Note: 0 represents the bulb is off and 1 represents the bulb is on.
	 * */
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1 };
		System.out.println(bulbs(arr));
	}

	private static int bulbs(int[] A) {

		boolean isSwitched = false;
		// false denotes default values
		// true denotes change in value due to faulty wire
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			if (isSwitched) {
				if (A[i] == 1) {
					A[i] = 1;
					count++;
					isSwitched = !isSwitched;
				}
			} else {
				if (A[i] == 0) {
					A[i] = 1;
					count++;
					isSwitched = !isSwitched;
				}
			}
		}
		return count;
	}
}
