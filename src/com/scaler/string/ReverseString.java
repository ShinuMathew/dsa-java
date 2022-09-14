package com.scaler.string;

public class ReverseString {
	
	public static void main(String[] args) {
		System.out.println(solve("scaler"));
		
	}
	
	private static String solve(String A) {
        char[] Achar = A.toCharArray();
        int s = 0;
        int e = Achar.length-1;

        while(s>e) {
            char temp = Achar[s];
            Achar[s] = Achar[e];
            Achar[e] = temp;
            s++;
            e--;
        }
        return String.valueOf(Achar);
    }

}
