package com.scalar.bitmanipulation;

public class AddBinaryStrings {

	/**
	 * Given two binary strings, return their sum (also a binary string).
	 * a = "100", b = "11". Return a + b = "111".
	 */
	public static void main(String[] args) {
		System.out.println(addBinary("1010110111001101101000", "1000011011000000111100110"));
	}

	//   WRONG SOLUTION	
	public static String addBinary(String A, String B) {
        char[] Achar = A.toCharArray();
        char[] Bchar = B.toCharArray();
        
        int a = 0;
        int b = 0;
        for(int i=Achar.length-1 ; i>=0; i--) {
            int aval = Integer.parseInt(String.valueOf(Achar[i]));
            a += Math.pow(2, Achar.length-1-i) * aval;
        }

        for(int i=Bchar.length-1 ; i>=0; i--) {
            int bval = Integer.parseInt(String.valueOf(Bchar[i]));
            b += Math.pow(2, Bchar.length-1-i) * bval;
        }

        int c = a+b;
        String result = "";
        
        while(c > 0) {
            int r = c%2;
            c = c/2;
            result += r;    
        }
        
        return result;
    }
}
