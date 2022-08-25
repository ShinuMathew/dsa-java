package com.scalar.basic;
import java.util.Scanner;

public class IsItPrime {

	/**
	 * Given an integer A, you have to tell whether it is a prime number or not.
	 * A prime number is a natural number greater than 1 which is divisible only by 1 and itself.
	 * */
	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        if(n == 0)
            System.out.println("NO");
        else {
            for (int i = 2; i <= n/2; i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) 
            System.out.println("YES");
        else
            System.out.println("NO");
    }
	
}
