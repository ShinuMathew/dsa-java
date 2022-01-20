package com.scalar.basicprogramming;
import java.util.Scanner;

public class PerfectNumer {

	/**
	 * You are given N positive integers.
	 * For each given integer A, you have to tell whether it is a perfect number or not.
	 * Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
	 * */
	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc1 = new Scanner(System.in);
        int N = sc1.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc1.nextInt();
        }

        for(int i = 0; i < N; i++) {
            int a = arr[i];
            checkForPerfectNumber(a);
        }
    }

    private static void checkForPerfectNumber(int a) {
        if(a <= 1) {
            System.out.println("YES");
            return;
        }
        int sum = 1;
        for(int i = 2; i <= a/2; i++) {
            if(a % i == 0) {
                sum += i;
            }
        }

        if(a == sum) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
