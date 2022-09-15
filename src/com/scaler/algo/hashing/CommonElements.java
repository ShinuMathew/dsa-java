package com.scaler.algo.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CommonElements {
	
	/**
	 * YET TO SOLVE
	 * Given two integer arrays, A and B of size N and M, respectively. 
	 * Your task is to find all the common elements in both the array.
	 */
	public static void main(String[] args) {

		YET TO SOLVE
		int[] A = { 1, 2, 2, 1 };
		int[] B = { 2, 3, 1, 2 };
		System.out.println(Arrays.toString(solve(A, B)));
	}
	
	private static int[] solve(int[] A, int[] B) {
        List<Integer> lst = new ArrayList<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0; i < A.length; i++) {
            if(hm.containsKey(A[i])) {
                int count = hm.get(A[i]);
                hm.put(A[i], count+1);
            } else {
                hm.put(A[i], 1);
            }
        }

        for(int i = 0; i < B.length; i++) {
            if(hm.containsKey(B[i])) {
                int count = hm.get(B[i]);
                hm.put(B[i], count+1);
            } else {
                hm.put(B[i], 1);
            }
        }

        int count = 0;
        for(Integer key : hm.keySet()) {
        	if(hm.get(key) > 1) {
        		int c = hm.get(key);
        		while(c > 1) {
        			lst.add(key);
        			c/=2;
        		}
        	}
        }

        int[] result = new int[lst.size()];
        for (int i = 0; i < result.length; i++) {
			result[i] = lst.get(i);
		}
        
        return result;

    }

}
