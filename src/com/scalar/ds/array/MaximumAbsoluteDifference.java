package com.scalar.ds.array;

public class MaximumAbsoluteDifference {

	/**
	 * Given an array, find the max value of function f(i, j). f(i, j) = |Ai - Aj| +
	 * |i - j| for all pairs for i, j
	 */
	public static void main(String[] args) {
		int[] arr = {1, 3, -1};
		System.out.println(maxAbsoluteDiffBF(arr));
		System.out.println(maxAbsoluteDiffOptimisedBF(arr));
		System.out.println(maxAbsoluteDiffOptimised(arr));
	}

	private static int maxAbsoluteDiffBF(int[] arr) {
		// Iterate on all pair of the array and get the absolute difference, find the
		// max.
		int max = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int val = Math.abs(arr[i] - arr[j]) + Math.abs(i - j);
				max = Math.max(max, val);
			}
		}
		return max;
	}
	
	private static int maxAbsoluteDiffOptimisedBF(int[] arr) {
		// Need not iterate on all pair of the array.
		// Since if i == j, then f(i, j) = 0. And since its absolute, the minimum value is 0. Hence we can ignore i == j
		// Also, we need to not consider both (i, j) and (j, i).
		// Therefore, only iterate on the upper or lower triangle and get the absolute difference, find the max.
		int max = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				int val = Math.abs(arr[i] - arr[j]) + Math.abs(i - j);
				max = Math.max(max, val);
			}
		}
		return max;
	}
	
	private static int maxAbsoluteDiffOptimised(int[] arr) {
		/**
		 * IDEA 1 : Always try to solve the absolute part in the problem if any
		 * 
		 * Lets divide f(i, j) and solve |Ai - Aj| and |i - j|
		 * 
		 * For |i - j|, since we are only taking the upper triangle, we can say that i < j
		 * 
		 * If i < j, then i-j = -ve
		 * So, |i-j| = -(i-j) => j-i
		 * 
		 * => |i-j| = (j - i)
		 * 
		 * 
		 * For |Ai - Aj|, we will assume 2 cases,
		 * 
		 * Case 1 : Ai >= Aj
		 * 
		 * Therefore, (Ai - Aj) = +ve
		 * 
		 * f(i, j) = (Ai - Aj) + (j - i)
		 * We can regroup the equation as,
		 * f(i, j)	= (Ai - i) - (Aj - j)
		 * 
		 * Lets say, Xk = (Ak - k)
		 *  = Xi - Xj
		 *  
		 * Here, we will create a new 'X' array which is based on the equation [Xk = (Ak - k)]
		 * Finally if we get the difference of the maximum and minimum value in this 'X' array, we will get our answer for Case 1.
		 * 
		 * fx(i, j) = Xmax - Xmin
		 * 
		 * Case 2 : Ai < Aj
		 * 
		 * Therefore Ai - Aj = -ve => |Ai-Aj| = -(Ai-Aj) = (Aj - Ai)
		 * 
		 * f(i, j) = (Aj - Ai) + (j - i)
		 * We can regroup the equation as,
		 * f(i, j)	= (Ai + i) - (Aj + j)
		 * 
		 * Let's say Yk = (Ak + k) 
		 * = Yi - Yj
		 * 
		 * Here, we will create a new 'Y' array which is based on the equation [Yk = (Ak + k)]
		 * Finally if we get the difference of the maximum and minimum value in this 'Y' array, we will get our answer for Case 2.
		 * So fy(i, j) = Ymax - Ymin
		 * 
		 * Finally get the max value after solving case 1 and case 2 
		 */
		
		// NEED NOT EXPLICITLY CREATE 'X' & 'Y' ARRAYS. YOU CAN DO IT IN ONE ITERATION
		
		int Xmax = Integer.MIN_VALUE;
		int Xmin = Integer.MAX_VALUE;
		int Ymax = Integer.MIN_VALUE;
		int Ymin = Integer.MAX_VALUE;
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int x = arr[i] - i;
			int y = arr[i] + i;
			Xmax = Math.max(Xmax, x);
			Xmin = Math.min(Xmin, x);
			Ymax = Math.max(Ymax, y);
			Ymin = Math.min(Ymin, y);
		}
		
		return Math.max(Xmax - Xmin, Ymax - Ymin);
	}

}
